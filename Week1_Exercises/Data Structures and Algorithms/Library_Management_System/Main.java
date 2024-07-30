public class Main {
    public static void main(String[] args) {
        // Adding books
        LibraryManager manager = new LibraryManager();
        manager.addBook(new Book(1, "Effective Java", "Joshua Bloch"));
        manager.addBook(new Book(2, "Java Concurrency in Practice", "Brian Goetz"));
        manager.addBook(new Book(3, "Design Patterns", "Erich Gamma"));

        // Linear search
        System.out.println("Linear Search Result: " + manager.searchBookByTitleLinear("Effective Java"));

        // Binary search setup
        Book[] sortedBooks = {
            new Book(1, "Effective Java", "Joshua Bloch"),
            new Book(2, "Java Concurrency in Practice", "Brian Goetz"),
            new Book(3, "Design Patterns", "Erich Gamma")
        };
        SortedLibraryManager sortedManager = new SortedLibraryManager(sortedBooks);

        // Binary search
        System.out.println("Binary Search Result: " + sortedManager.searchBookByTitleBinary("Java Concurrency in Practice"));
    }
}
