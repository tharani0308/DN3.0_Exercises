-- scenario3.sql
-- Ensure data integrity when adding a new customer

CREATE OR REPLACE PROCEDURE AddNewCustomer (
    p_customer_id IN customers.customer_id%TYPE,
    p_name IN customers.name%TYPE,
    p_address IN customers.address%TYPE
) IS
BEGIN
    -- Insert new customer
    INSERT INTO customers (customer_id, name, address)
    VALUES (p_customer_id, p_name, p_address);
    
    COMMIT;
    
EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        -- Handle duplicate customer ID
        DBMS_OUTPUT.PUT_LINE('Customer ID ' || p_customer_id || ' already exists.');
        ROLLBACK;
    WHEN OTHERS THEN
        -- Log other errors
        DBMS_OUTPUT.PUT_LINE(SQLERRM);
        RAISE;
END AddNewCustomer;
/
