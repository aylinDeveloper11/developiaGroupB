package classObj;

public class Main {
	 public static void main(String[] args) {
	        Person person1 = new Person();
	        Person person2 = new Person("Aylin");
	        Person person3 = new Person("Aylin", 12);

	        System.out.println(person1.displayInfo());
	        System.out.println(person2.displayInfo());
	        System.out.println(person3.displayInfo());
}
}
