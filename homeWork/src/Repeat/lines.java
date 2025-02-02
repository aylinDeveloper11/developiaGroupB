package Repeat;

import java.util.Scanner;

public class lines {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		  System.out.print("Введите строку: ");
		  String line = scanner.nextLine();
		  
		  
		  System.out.println("Изменение строки: " +  line.replace(" ", "_"));
		
		  scanner.close();
	}
}
