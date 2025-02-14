package firstJavaProject;

import java.util.Scanner;

public class newScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("введите число");
		int number = scanner.nextInt();
		
		System.out.println("введите число");
		int number2= scanner.nextInt();
		
		System.out.println("введите число");
		int number3= scanner.nextInt();
		
		System.out.println("Среднее арифметическое");
		int result = number+number2+number3/3;
		System.out.println(result);
		
		if (number>0 && number2>0 && number3>0) {
			System.out.println("Все числа положительны");
		}else {
			System.out.println("Все числа отрицательны");
		}
		
	}
}
