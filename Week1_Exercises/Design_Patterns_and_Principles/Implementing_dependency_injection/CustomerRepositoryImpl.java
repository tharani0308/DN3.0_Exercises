import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    // Simulating a data source with a simple in-memory map
    private Map<String, Customer> customerDatabase = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Adding some sample data
        customerDatabase.put("1", new Customer("1", "Alice", "alice@example.com"));
        customerDatabase.put("2", new Customer("2", "Bob", "bob@example.com"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerDatabase.get(id);
    }
}
