public class ComputerTest {
    public static void main(String[] args) {
        // Create a basic Computer configuration
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM(8)
                .setStorage(256)
                .setSSD(true)
                .build();

        // Create a high-end Computer configuration
        Computer highEndComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM(32)
                .setStorage(1024)
                .setSSD(true)
                .build();

        // Display the configurations
        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("High-End Computer: " + highEndComputer);
    }
}
