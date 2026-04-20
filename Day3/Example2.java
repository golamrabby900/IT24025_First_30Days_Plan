class Car {
    String color;
    int speed;

    // Parameterized constructor
    Car(String c, int s) {
        color = c;
        speed = s;
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Red", 120);
        c1.display();
    }
}