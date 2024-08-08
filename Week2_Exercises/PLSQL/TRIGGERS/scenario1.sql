-- scenario1.sql
-- Automatically update the last modified date when a customer's record is updated

CREATE OR REPLACE TRIGGER UpdateCustomerLastModified
BEFORE UPDATE ON customers
FOR EACH ROW
BEGIN
    :NEW.last_modified := SYSDATE;
END UpdateCustomerLastModified;
/
