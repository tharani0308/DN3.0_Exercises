-- scenario3.sql
-- Transfer funds between accounts

CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account_id IN accounts.account_id%TYPE,
    p_to_account_id IN accounts.account_id%TYPE,
    p_amount IN NUMBER
) IS
    v_balance accounts.balance%TYPE;
BEGIN
    -- Start transaction
    SAVEPOINT transfer_start;

    -- Check balance of from_account
    SELECT balance INTO v_balance FROM accounts WHERE account_id = p_from_account_id FOR UPDATE;
    
    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in account ' || p_from_account_id);
    END IF;
    
    -- Deduct amount from from_account
    UPDATE accounts SET balance = balance - p_amount WHERE account_id = p_from_account_id;
    
    -- Add amount to to_account
    UPDATE accounts SET balance = balance + p_amount WHERE account_id = p_to_account_id;
    
    -- Commit transaction
    COMMIT;
    
EXCEPTION
    WHEN OTHERS THEN
        -- Rollback to savepoint in case of error
        ROLLBACK TO transfer_start;
        -- Log the error
        DBMS_OUTPUT.PUT_LINE(SQLERRM);
        RAISE;
END TransferFunds;
/
