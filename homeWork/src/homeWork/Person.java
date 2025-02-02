package homeWork;

public class Person {
	String name;    
    int age;
    
    Person(String name,int age) {
    	this.name = name;
    	this.age = age;
    	}
    
    
    public static void main(String[] args) {
   
        Person person = new Person("Aylin",12);
        
        
        System.out.println("Имя: " + person.name);
        System.out.println("Возвраст: " + person.age);
      
    }

}
