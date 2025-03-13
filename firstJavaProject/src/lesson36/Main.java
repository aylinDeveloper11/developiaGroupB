package lesson36;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
public static void main(String[] args) {
	Person person1 = new Person("Aylin", "Suleymanli");
	Person person2 = new Person("Nara", "Axmedova");
	Person person3 = new Person("Meleyke", "Shukurlu");

	List<Person> personList = new ArrayList<Person>();
	personList.add(person1);
	personList.add(person2);
	personList.add(person3);
	System.out.println(personList);
	
	 Set<Person> personSet = new HashSet<Person>();
	 personSet.add(person1);
		personSet.add(person2);
		personSet.add(person3);
		System.out.println(personSet);
	
}

}
