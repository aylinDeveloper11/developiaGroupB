package LSP;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};
        
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}