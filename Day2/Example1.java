class Person {
    private String name;
    private int age;

    // Setter methods
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Main {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setName("Rabby");
        p1.setAge(21);

        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
    }
}