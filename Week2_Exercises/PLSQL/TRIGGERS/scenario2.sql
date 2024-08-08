-- scenario2.sql
-- Maintain an audit log for all transactions

CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON transactions
FOR EACH ROW
BEGIN
    INSERT INTO audit_log (transaction_id, log_date, description)
    VALUES (:NEW.transaction_id, SYSDATE, 'Transaction of ' || :NEW.amount || ' ' || :NEW.transaction_type);
END LogTransaction;
/
