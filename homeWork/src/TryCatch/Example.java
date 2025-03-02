package TryCatch;
 
public class Example {	
public static void checkNumber(int number) {
	
	int number1 = -5;

	if (number1 < 0) {
		throw new IllegalArgumentException("Число должно быть больше чем 0");
	} else {
        System.out.println("Данное число больше нуля, это положительное число");
	}
	
}
}
