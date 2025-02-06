package classObj4;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Aylin", 12, "Baku");
        Person person2 = new Person("Leyla", 13, "Los Angeles");
        Person person3 = new Person("Alina", 9, "San Francisco");

        System.out.println(person1.toString());
        System.out.println(person2.toString());

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
    }

}
