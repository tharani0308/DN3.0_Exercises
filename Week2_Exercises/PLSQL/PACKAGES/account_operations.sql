-- account_operations.sql
-- Group all account-related operations into a package

CREATE OR REPLACE PACKAGE AccountOperations AS
    PROCEDURE OpenAccount (p_account_id IN NUMBER, p_customer_id IN NUMBER, p_account_type IN VARCHAR2, p_balance IN NUMBER);
    PROCEDURE CloseAccount (p_account_id IN NUMBER);
    FUNCTION GetTotalBalance (p_customer_id IN NUMBER) RETURN NUMBER;
END AccountOperations;
/

CREATE OR REPLACE PACKAGE BODY AccountOperations AS
    PROCEDURE OpenAccount (p_account_id IN NUMBER, p_customer_id IN NUMBER, p_account_type IN VARCHAR2, p_balance IN NUMBER) IS
    BEGIN
        INSERT INTO accounts (account_id, customer_id, account_type, balance, last_modified)
        VALUES (p_account_id, p_customer_id, p_account_type, p_balance, SYSDATE);
        COMMIT;
    EXCEPTION
        WHEN DUP_VAL_ON_INDEX THEN
            DBMS_OUTPUT.PUT_LINE('Account ID ' || p_account_id || ' already exists.');
            ROLLBACK;
        WHEN OTHERS THEN
            DBMS_OUTPUT.PUT_LINE(SQLERRM);
            RAISE;
    END OpenAccount;

    PROCEDURE CloseAccount (p_account_id IN NUMBER) IS
    BEGIN
        DELETE FROM accounts WHERE account_id = p_account_id;
        COMMIT;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('Account ID ' || p_account_id || ' not found.');
            ROLLBACK;
        WHEN OTHERS THEN
            DBMS_OUTPUT.PUT_LINE(SQLERRM);
            RAISE;
    END CloseAccount;

    FUNCTION GetTotalBalance (p_customer_id IN NUMBER) RETURN NUMBER IS
        v_total_balance NUMBER;
    BEGIN
        SELECT SUM(balance) INTO v_total_balance FROM accounts WHERE customer_id = p_customer_id;
        RETURN v_total_balance;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('Customer ID ' || p_customer_id || ' not found.');
            RETURN NULL;
    END GetTotalBalance;
END AccountOperations;
/
