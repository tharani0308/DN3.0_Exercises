public class Main {
    public static void main(String[] args) {
        // Sample orders
        Order[] orders = {
            new Order("O001", "Alice", 250.0),
            new Order("O002", "Bob", 100.0),
            new Order("O003", "Charlie", 300.0),
            new Order("O004", "David", 150.0)
        };

        // Sort using Bubble Sort
        BubbleSort.bubbleSort(orders);
        System.out.println("Bubble Sort Results:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Reinitialize orders for Quick Sort
        orders = new Order[] {
            new Order("O001", "Alice", 250.0),
            new Order("O002", "Bob", 100.0),
            new Order("O003", "Charlie", 300.0),
            new Order("O004", "David", 150.0)
        };

        // Sort using Quick Sort
        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nQuick Sort Results:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
