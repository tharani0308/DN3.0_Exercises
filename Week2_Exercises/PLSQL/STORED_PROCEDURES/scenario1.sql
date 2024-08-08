-- scenario1.sql
-- Process monthly interest for all savings accounts

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    -- Update balance for all savings accounts
    UPDATE accounts
    SET balance = balance * 1.01
    WHERE account_type = 'Savings';
    
    COMMIT;
END ProcessMonthlyInterest;
/
