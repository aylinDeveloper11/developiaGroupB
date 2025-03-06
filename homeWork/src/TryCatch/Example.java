package TryCatch;
 
public class Example {	
	
	
public static void checkNumber(int number) {
	if (number < 0) {
		throw new IllegalArgumentException("Число должно быть больше чем 0");
	} else {
        System.out.println("Данное число больше нуля, это положительное число");
	}
	
}

public static void main(String[] args) {
	checkNumber(-17);
}
}
