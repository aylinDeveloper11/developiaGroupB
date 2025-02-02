package packageB;

import packageA.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Aylin", 12, "Azerbaijan", 12345);

        System.out.println(person);
        person.getDetails();
    }

}
