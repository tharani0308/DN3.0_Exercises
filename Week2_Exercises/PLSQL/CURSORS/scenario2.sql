-- scenario2.sql
-- Apply annual fee to all accounts

DECLARE
    CURSOR account_cursor IS 
        SELECT account_id, balance
        FROM accounts;
    v_account_id accounts.account_id%TYPE;
    v_balance accounts.balance%TYPE;
BEGIN
    FOR account_rec IN account_cursor LOOP
        v_account_id := account_rec.account_id;
        v_balance := account_rec.balance;
        
        UPDATE accounts
        SET balance = v_balance - 50
        WHERE account_id = v_account_id;
    END LOOP;
    COMMIT;
END;
/
