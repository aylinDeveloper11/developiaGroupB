package classObj;

public class Person {
	private String name;
    private int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }
    
    public Person(String name) {
        this.name = name;
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String displayInfo() {
        return "Person[name=" + name + ", age=" + age + "]";
    }

}
