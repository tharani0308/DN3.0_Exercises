public class Main {
    public static void main(String[] args) {
        // Create a basic EmailNotifier
        Notifier emailNotifier = new EmailNotifier();
        
        // Decorate EmailNotifier with SMSNotifierDecorator
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        
        // Further decorate with SlackNotifierDecorator
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);
        
        // Send a notification
        slackNotifier.send("Hello, this is a test notification!");
    }
}
