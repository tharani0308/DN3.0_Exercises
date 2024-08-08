-- scenario3.sql
-- Update the interest rate for all loans based on a new policy

DECLARE
    CURSOR loan_cursor IS 
        SELECT loan_id, interest_rate
        FROM loans;
    v_loan_id loans.loan_id%TYPE;
    v_interest_rate loans.interest_rate%TYPE;
BEGIN
    FOR loan_rec IN loan_cursor LOOP
        v_loan_id := loan_rec.loan_id;
        v_interest_rate := loan_rec.interest_rate;
        
        UPDATE loans
        SET interest_rate = v_interest_rate + 0.5
        WHERE loan_id = v_loan_id;
    END LOOP;
    COMMIT;
END;
/
