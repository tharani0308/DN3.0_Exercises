-- scenario1.sql
-- Calculate the age of customers for eligibility checks

CREATE OR REPLACE FUNCTION CalculateAge (
    p_dob IN DATE
) RETURN NUMBER IS
    v_age NUMBER;
BEGIN
    SELECT FLOOR((SYSDATE - p_dob) / 365.25) INTO v_age FROM dual;
    RETURN v_age;
END CalculateAge;
/
