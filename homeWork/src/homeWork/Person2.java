package homeWork;

public class Person2 {

	  String name;
	    int age;
	    
	    public Person2() {
	        name = "Unknown";
	        age = 0;
	    }
	    

	    public Person2(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    
	    public static void main(String[] args) {
	        Person2 person1 = new Person2();
	        System.out.println(person1.name + " " + person1.age);

	        Person2 person2 = new Person2("Aylin", 12);
	        System.out.println(person2.name + " " + person2.age);
	    }


}
