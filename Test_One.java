class Person {
    private String name;
    private int age;

    //Make a default constructor
    public Person() {
        this.name="mahfuz";
        this.age=28;

    }

    //Make a Parameterized constructor
    public Person(String name, int age) {
        //Write your code here...
        this.name=name;
        this.age=age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class ICE {
    public static void main(String[] args) {
        person person1 = new person();
        person person2 = new person(mahfuz,28);
        
        
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}
