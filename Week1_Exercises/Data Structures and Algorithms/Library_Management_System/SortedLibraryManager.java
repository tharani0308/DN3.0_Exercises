import java.util.Arrays;

public class SortedLibraryManager {
    private Book[] books;

    public SortedLibraryManager(Book[] books) {
        this.books = books;
        Arrays.sort(this.books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
    }

    public Book searchBookByTitleBinary(String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Book not found
    }
}
