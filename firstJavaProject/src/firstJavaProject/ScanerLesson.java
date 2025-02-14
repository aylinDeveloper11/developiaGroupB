package firstJavaProject;

import java.util.Scanner;

public class ScanerLesson {
	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		

		System.out.println("Введите своё имя");
		String name = input.nextLine();
		
		System.out.println("Введите свой возраст");
		int age = input.nextInt();
		
		System.out.println("ваше имя " + name + " ваш возраст " + age);
		
		System.out.println(name.toUpperCase());
		
		
		
		
		
	}
}
