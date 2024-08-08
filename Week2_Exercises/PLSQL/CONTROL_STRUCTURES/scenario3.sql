-- scenario3.sql
-- Send reminders to customers whose loans are due within the next 30 days

DECLARE
    CURSOR loan_cursor IS 
        SELECT customer_id, loan_due_date
        FROM loans
        WHERE loan_due_date BETWEEN SYSDATE AND SYSDATE + 30;
    v_customer_id loans.customer_id%TYPE;
    v_loan_due_date loans.loan_due_date%TYPE;
BEGIN
    FOR loan_rec IN loan_cursor LOOP
        v_customer_id := loan_rec.customer_id;
        v_loan_due_date := loan_rec.loan_due_date;
        
        DBMS_OUTPUT.PUT_LINE('Reminder: Customer ID ' || v_customer_id || 
                             ' has a loan due on ' || TO_CHAR(v_loan_due_date, 'YYYY-MM-DD'));
    END LOOP;
END;
/
