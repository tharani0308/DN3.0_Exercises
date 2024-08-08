-- scenario3.sql
-- Check if a customer has sufficient balance before making a transaction

CREATE OR REPLACE FUNCTION HasSufficientBalance (
    p_account_id IN accounts.account_id%TYPE,
    p_amount IN NUMBER
) RETURN BOOLEAN IS
    v_balance accounts.balance%TYPE;
BEGIN
    SELECT balance INTO v_balance FROM accounts WHERE account_id = p_account_id;
    RETURN v_balance >= p_amount;
END HasSufficientBalance;
/
