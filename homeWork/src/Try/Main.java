package Try;

public class Main {
public static void main(String[] args) {
	
	//ArithmeticException
	
	try {
		System.out.println(10/0);
	} catch (ArithmeticException e) {
        System.err.println("Ошибка на ноль не делится");
	}
	
    //NullPointerException
	
	try {
		String s = null;
		System.out.println(s.length());
	} catch (NullPointerException e) {
      System.err.println("Ошибка обращения к null объекту ");
	}
	
	//ArrayIndexOutOfBoundsException
	
	try {
		int[] number = {1,2,3,4,5,6,7,8,9};
		System.out.println(number[17]);
	} catch (IndexOutOfBoundsException e) {
		System.err.println("Ошибка выход за предел массива");
	}
	
	//NumberFormatException
	
	try {
	  String string = "Aylin";
	  
	  int number = Integer.parseInt(string);
	  System.out.println(number);
	} catch (NumberFormatException e) {
		System.err.println("Ошибка: преобразование стороки в число");
	}
	
	
}
}
