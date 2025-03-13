package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        List<String> names = new ArrayList<>();

	        System.out.println("Введите имя:");
	        String name = scanner.nextLine();
	        names.add(name);

	        System.out.println("Введите следующее имя:");
	        name = scanner.nextLine();
	        names.add(name);

	        System.err.println("Все имена:");
	        for (String n : names) {
	            System.out.println(n);
	        }

	        scanner.close();
}
}