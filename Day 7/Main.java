class CPU {
    double price = 450.0;

    // Member Inner Class
    class Processor {
        double cores = 8.0;
        String manufacturer = "Intel";

        void displayInfo() {
            // Accessing variable from the outer class
            System.out.println("CPU Price: " + price);
            System.out.println("Cores: " + cores);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Create an object of the outer class
        CPU myCpu = new CPU();

        // 2. Create an object of the inner class using the outer object
        CPU.Processor myProcessor = myCpu.new Processor();

        myProcessor.displayInfo();
    }
}
