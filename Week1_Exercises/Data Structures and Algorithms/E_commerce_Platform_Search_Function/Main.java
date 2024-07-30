public class Main {
    public static void main(String[] args) {
        // Create an array of products
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Table", "Furniture")
        };

        // Linear Search
        Product result = SearchUtil.linearSearch(products, "P002");
        System.out.println("Linear Search Result: " + result);

        // Sort products for binary search
        SearchUtil.sortProducts(products);

        // Binary Search
        result = SearchUtil.binarySearch(products, "P003");
        System.out.println("Binary Search Result: " + result);
    }
}
