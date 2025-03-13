package lesson36;

import java.util.Objects;

public class Person {
String name;
String surname;

public Person(String name, String surname) {
	
	this.name = name;
	this.surname = surname;
}

@Override
public String toString() {
	return "Person [name=" + name + ", surname=" + surname + "]";
}

@Override
public int hashCode() {
	return Objects.hash(name, surname);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	return Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
}






}
