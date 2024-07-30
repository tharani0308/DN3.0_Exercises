public class EmployeeManager {
    private Employee[] employees;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public EmployeeManager() {
        employees = new Employee[INITIAL_CAPACITY];
        size = 0;
    }

    public void addEmployee(Employee employee) {
        if (size == employees.length) {
            resizeArray();
        }
        employees[size++] = employee;
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null; // Employee not found
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int employeeId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[size - 1] = null;
            size--;
        }
    }

    private void resizeArray() {
        Employee[] newArray = new Employee[employees.length * 2];
        System.arraycopy(employees, 0, newArray, 0, size);
        employees = newArray;
    }
}
