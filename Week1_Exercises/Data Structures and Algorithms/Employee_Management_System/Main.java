public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Adding employees
        manager.addEmployee(new Employee(1, "Emy", "Developer", 70000));
        manager.addEmployee(new Employee(2, "Charles", "Manager", 80000));
        manager.addEmployee(new Employee(3, "Arjun", "Analyst", 60000));

        // Searching for an employee
        System.out.println("Search Result: " + manager.searchEmployee(2));

        // Traversing employees
        System.out.println("All Employees:");
        manager.traverseEmployees();

        // Deleting an employee
        manager.deleteEmployee(2);
        System.out.println("After Deletion:");
        manager.traverseEmployees();
    }
}
