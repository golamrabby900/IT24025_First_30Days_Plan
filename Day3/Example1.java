class Student {
    String name;

    // Default constructor
    Student() {
        name = "Unknown";
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}