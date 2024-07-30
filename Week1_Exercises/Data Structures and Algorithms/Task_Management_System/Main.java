public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Adding tasks
        manager.addTask(new Task(1, "Complete Assignment", "Pending"));
        manager.addTask(new Task(2, "Attend Meeting", "Completed"));
        manager.addTask(new Task(3, "Write Report", "In Progress"));

        // Searching for a task
        System.out.println("Search Result: " + manager.searchTask(2));

        // Traversing tasks
        System.out.println("All Tasks:");
        manager.traverseTasks();

        // Deleting a task
        manager.deleteTask(2);
        System.out.println("After Deletion:");
        manager.traverseTasks();
    }
}
