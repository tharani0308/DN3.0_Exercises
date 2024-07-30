public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Add products
        Product product1 = new Product("P001", "Laptop", 10, 99999.99);
        Product product2 = new Product("P002", "Smartphone", 20, 54499.99);
        Product product3 = new Product("P003", "Airpods", 30, 1599.99);
        Product product4 = new Product("P004", "Mouse", 40, 499.99);
        manager.addProduct(product1);
        manager.addProduct(product2);
        manager.addProduct(product3);
        manager.addProduct(product4);

        // Display products
        System.out.println("Initial Inventory:");
        manager.displayProducts();

        // Update a product
        Product updatedProduct = new Product("P001", "Laptop", 8, 96649.99);
        manager.updateProduct("P001", updatedProduct);

        // Display products after update
        System.out.println("\nInventory After Update:");
        manager.displayProducts();

        // Delete a product
        manager.deleteProduct("P002");

        // Display products after deletion
        System.out.println("\nInventory After Deletion:");
        manager.displayProducts();
    }
}
