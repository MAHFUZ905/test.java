class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "mahfuz";
        this.age = 28;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ICE {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("mahfuz", 28);

        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}
