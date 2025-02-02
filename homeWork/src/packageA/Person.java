package packageA;

public class Person {
	    private String name;
	    protected int age;
	    String country;
	    public int id;
	    
	    public Person(String name, int age, String country, int id) {
	        this.name = name;
	        this.age = age;
	        this.country = country;
	        this.id = id;
	    }

	    public void getDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Country: " + country);
	        System.out.println("ID: " + id);
	    }
}
