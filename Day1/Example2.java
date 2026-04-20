class Rectangle {
    int length;
    int width;

    int area() {
        return length * width;
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();   // object
        r1.length = 10;
        r1.width = 5;

        System.out.println("Area: " + r1.area());
    }
}