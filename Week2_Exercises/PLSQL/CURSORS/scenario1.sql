-- scenario1.sql
-- Generate monthly statements for all customers

DECLARE
    CURSOR transaction_cursor IS 
        SELECT customer_id, transaction_date, amount, transaction_type
        FROM transactions
        WHERE transaction_date BETWEEN TRUNC(SYSDATE, 'MM') AND LAST_DAY(SYSDATE);
    v_customer_id transactions.customer_id%TYPE;
    v_transaction_date transactions.transaction_date%TYPE;
    v_amount transactions.amount%TYPE;
    v_transaction_type transactions.transaction_type%TYPE;
BEGIN
    FOR transaction_rec IN transaction_cursor LOOP
        v_customer_id := transaction_rec.customer_id;
        v_transaction_date := transaction_rec.transaction_date;
        v_amount := transaction_rec.amount;
        v_transaction_type := transaction_rec.transaction_type;
        
        DBMS_OUTPUT.PUT_LINE('Customer ID: ' || v_customer_id || ', Date: ' || 
                             TO_CHAR(v_transaction_date, 'YYYY-MM-DD') || ', Amount: ' || 
                             v_amount || ', Type: ' || v_transaction_type);
    END LOOP;
END;
/
