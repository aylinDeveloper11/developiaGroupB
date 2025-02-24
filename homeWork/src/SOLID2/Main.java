package SOLID2;

public class Main {
	public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Гав!");
            }
        };

        Animal cat = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Мяу!");
            }
        };

        Animal cow = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Му-у-у!");
            }
        };

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}
