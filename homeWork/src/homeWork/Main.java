package homeWork;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	CalculatorClass calculator = new CalculatorClass();
	 Scanner scanner = new Scanner(System.in);

	 System.out.print("Введите первое число: ");
     double a = scanner.nextDouble();
     System.out.print("Введите второе число: ");
     double b = scanner.nextDouble();

     scanner.nextLine();
     
     System.out.println("Выберите операцию:  +,-,*,/");
     
     String operation = scanner.nextLine();

     if (operation.equals("+")) {
         System.out.println("Результат: " + calculator.add(a, b));
     } else if (operation.equals("-")) {
         System.out.println("Результат: " + calculator.subtract(a, b));
     } else if (operation.equals("*")) {
         System.out.println("Результат: " + calculator.multiply(a, b));
     } else if (operation.equals("/")) {
         System.out.println("Результат: " + calculator.divide(a, b));
     } else {
         System.out.println("Неверная операция");
     }

     scanner.close();     
     
}
}
