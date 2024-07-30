// Interface for different document types
public interface Document {
    void open();
}

// Concrete implementations
public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document.");
    }
}

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document.");
    }
}

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document.");
    }
}
