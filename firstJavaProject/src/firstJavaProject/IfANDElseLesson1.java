package firstJavaProject;

import java.util.Scanner;

public class IfANDElseLesson1 {
	public static void main(String[] args) {
		
		boolean rain = true;
		
		if (rain) {
			System.out.println("Возьмите зонт");
		}else {
			System.out.println("Зонт вам не нужен");
		}
		
		int a = 12;
		String result = (a % 2 ==0) ? "число чётное" : "число нечётное";
		
		System.out.println(result);
		
		
	}
}
