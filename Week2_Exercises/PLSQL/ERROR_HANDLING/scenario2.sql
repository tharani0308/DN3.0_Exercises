-- scenario2.sql
-- Manage errors when updating employee salaries

CREATE OR REPLACE PROCEDURE UpdateSalary (
    p_employee_id IN employees.employee_id%TYPE,
    p_percentage IN NUMBER
) IS
BEGIN
    -- Update salary
    UPDATE employees
    SET salary = salary + (salary * p_percentage / 100)
    WHERE employee_id = p_employee_id;
    
    IF SQL%NOTFOUND THEN
        RAISE_APPLICATION_ERROR(-20002, 'Employee ID ' || p_employee_id || ' does not exist.');
    END IF;
    
    COMMIT;
    
EXCEPTION
    WHEN OTHERS THEN
        -- Log the error
        DBMS_OUTPUT.PUT_LINE(SQLERRM);
        RAISE;
END UpdateSalary;
/
