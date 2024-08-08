-- scenario2.sql
-- Implement a bonus scheme for employees based on their performance

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department IN employees.department%TYPE,
    p_bonus_percentage IN NUMBER
) IS
BEGIN
    -- Update salary with bonus for specified department
    UPDATE employees
    SET salary = salary + (salary * p_bonus_percentage / 100)
    WHERE department = p_department;
    
    COMMIT;
END UpdateEmployeeBonus;
/
