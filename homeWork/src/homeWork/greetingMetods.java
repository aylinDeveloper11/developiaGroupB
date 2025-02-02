package homeWork;

public class greetingMetods {

    public static void main(String[] args) {
        greetingMetods greeting = new greetingMetods();
        
        greeting.greet("Aylin"); 
    }

    public void greet(String name) {
        System.out.println("Hi, " + name + "!");
    }
}
