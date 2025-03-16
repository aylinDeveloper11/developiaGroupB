package HashSet;

import java.util.HashSet;
import java.util.Set;


public class Test {
public static void main(String[] args) {
	Animal animal1 = new Animal("Dog", "bone");
	Animal animal2 = new Animal("Cat", "meat");

	 Set<Animal> animalSet = new HashSet<Animal>();
        animalSet.add(animal1);
        animalSet.add(animal2);
		System.out.println(animalSet);

}
}
