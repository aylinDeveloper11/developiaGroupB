package homeWork;

public class squareOfTheNumber {

    public static void main(String[] args) {
    	
        squareOfTheNumber square = new squareOfTheNumber();
        
        square.calculateSquare(11); 
        square.calculateSquare(143);
    }

    
    public void calculateSquare(int number) {
        int square = number * number;  
        System.out.println("Квадрат числа " + number + " равен: " + square);
    }
}
