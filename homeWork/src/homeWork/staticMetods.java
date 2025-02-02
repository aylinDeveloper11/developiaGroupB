package homeWork;

public class staticMetods {
	 static {
	        System.out.println("Программа началась");
	    }

	    public static int findAverage(int num1, int num2, int num3) {
	        return (num1 + num2 + num3) / 3;  
	    }

	    public static void main(String[] args) {
	        System.out.println("Среднее значение: " + findAverage(5, 10, 15));
	    }
}


