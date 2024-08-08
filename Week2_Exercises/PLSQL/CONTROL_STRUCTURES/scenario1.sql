-- scenario1.sql
-- Apply a discount to loan interest rates for customers above 60 years old

DECLARE
    CURSOR customer_cursor IS 
        SELECT customer_id, age, loan_interest_rate
        FROM customers;
    v_customer_id customers.customer_id%TYPE;
    v_age customers.age%TYPE;
    v_loan_interest_rate customers.loan_interest_rate%TYPE;
BEGIN
    FOR customer_rec IN customer_cursor LOOP
        v_customer_id := customer_rec.customer_id;
        v_age := customer_rec.age;
        v_loan_interest_rate := customer_rec.loan_interest_rate;
        
        IF v_age > 60 THEN
            UPDATE customers
            SET loan_interest_rate = v_loan_interest_rate * 0.99
            WHERE customer_id = v_customer_id;
        END IF;
    END LOOP;
    COMMIT;
END;
/
