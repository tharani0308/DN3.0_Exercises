-- scenario3.sql
-- Enforce business rules on deposits and withdrawals

CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON transactions
FOR EACH ROW
BEGIN
    IF :NEW.transaction_type = 'Withdrawal' AND :NEW.amount > 
        (SELECT balance FROM accounts WHERE account_id = :NEW.account_id) THEN
        RAISE_APPLICATION_ERROR(-20003, 'Insufficient balance for withdrawal.');
    ELSIF :NEW.transaction_type = 'Deposit' AND :NEW.amount <= 0 THEN
        RAISE_APPLICATION_ERROR(-20004, 'Deposit amount must be positive.');
    END IF;
END CheckTransactionRules;
/
