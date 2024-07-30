public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // The image is loaded and displayed only when needed
        image1.display(); // Image will be loaded here
        image1.display(); // Image will be displayed from cache
        
        image2.display(); // Image will be loaded here
    }
}
