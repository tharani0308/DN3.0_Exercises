public class DependencyInjectionDemo {
    public static void main(String[] args) {
        // Create a concrete repository instance
        CustomerRepository repository = new CustomerRepositoryImpl();
        
        // Inject the repository into the service
        CustomerService service = new CustomerService(repository);

        // Use the service to find a customer
        Customer customer = service.getCustomerDetails("1");

        // Display customer details
        if (customer != null) {
            System.out.println("Customer ID: " + customer.getId());
            System.out.println("Customer Name: " + customer.getName());
            System.out.println("Customer Email: " + customer.getEmail());
        } else {
            System.out.println("Customer not found.");
        }
    }
}
