package homeWork;

public class MaxMetods {

    public static void main(String[] args) {
        MaxMetods maxNumber = new MaxMetods();
        
        int result = maxNumber.findMax(15, 22, 9);  
        System.out.println("Наибольшее число: " + result);  
    }

    public int findMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b; 
        } else {
            return c;  
        }
    }
}