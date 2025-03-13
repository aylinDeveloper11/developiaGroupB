package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<String> names = new ArrayList<>();

	        System.out.println("Введите имя:");
	        String name = scanner.nextLine();
	        names.add(name);

	        System.out.println("Введите следующее имя:");
	        name = scanner.nextLine();
	        names.add(name);

	        System.out.println("Введите имя для поиска:");
	        String searchName = scanner.nextLine();

	        if (names.contains(searchName)) {
	            System.out.println("Имя найдено.");
	        } else {
	            System.out.println("Имя не найдено.");
	        }

	        scanner.close();
	    }
}
