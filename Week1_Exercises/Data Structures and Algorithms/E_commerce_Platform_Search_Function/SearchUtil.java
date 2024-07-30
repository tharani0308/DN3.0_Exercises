import java.util.Arrays;

public class SearchUtil {

    // Linear Search
    public static Product linearSearch(Product[] products, String productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null; // Product not found
    }

    // Binary Search (requires sorted array)
    public static Product binarySearch(Product[] products, String productId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products[mid];

            if (midProduct.getProductId().equals(productId)) {
                return midProduct;
            } else if (productId.compareTo(midProduct.getProductId()) < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null; // Product not found
    }

    // Utility method to sort products by productId (for binary search)
    public static void sortProducts(Product[] products) {
        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));
    }
}
