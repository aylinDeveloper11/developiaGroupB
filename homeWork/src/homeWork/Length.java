package homeWork;

public class Length {

    public static void main(String[] args) {
        
        Length lengthObj = new Length();
        
        int length1 = lengthObj.calculateLength("Hi I am Aylin!");  
        System.out.println("Длина строки равна: " + length1);
        
        int length2 = lengthObj.calculateLength("Java");  
        System.out.println("Длина строки  равна: " + length2);
    }

    public int calculateLength(String str) {
        return str.length();  
    }
}
