public class Main {
    public static void main(String[] args) {
        // Get the single instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Test if both instances are the same
        System.out.println("Are both logger instances the same? " + (logger1 == logger2));

        // Use the logger instance to log messages
        logger1.log("This is a test log message.");

        // You can use the second reference to the logger instance as well
        logger2.log("This is another test log message.");
    }
}

