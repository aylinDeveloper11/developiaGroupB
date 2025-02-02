package homeWork;

import java.util.Scanner;

public class ifElseHomeWork2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите первое число: ");
		int a = scanner.nextInt();

		System.out.print("Введите второе число: ");
		int b = scanner.nextInt();

		scanner.nextLine();

		System.out.print("Введите какой либо оператор: ");
		String operation = scanner.nextLine();

		switch (operation) {
		case "+":
			System.out.println("Результат: " + (a + b));
			break;
		case "-":
			System.out.println("Результат: " + (a - b));
			break;
		case "*":
			System.out.println("Результат: " + (a * b));
			break;
		case "/":
			System.out.println("Результат: " + (a / b));
			break;
		default:
			System.out.println("Некорректный оператор.");
			break;
		}

		scanner.close();

	}
}
