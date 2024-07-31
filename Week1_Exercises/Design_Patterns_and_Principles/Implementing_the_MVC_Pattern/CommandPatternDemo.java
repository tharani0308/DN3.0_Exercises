public class MVCPatternDemo {
    public static void main(String[] args) {
        // Create a student model
        Student student = new Student("John Doe", "12345", "A");

        // Create a view for displaying student details
        StudentView view = new StudentView();

        // Create a controller to manage the model and view
        StudentController controller = new StudentController(student, view);

        // Display student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}
