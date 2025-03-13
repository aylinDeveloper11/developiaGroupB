package HashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        System.out.println("Введите число:");
        int number = scanner.nextInt();
        numbers.add(number);

        System.out.println("Введите следующее число:");
        number = scanner.nextInt();
        numbers.add(number);

        System.out.println("Уникальные числа:");
        for (int num : numbers) {
            System.out.println(num);
        }

        scanner.close();
    }
}
