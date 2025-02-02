package homeWork;

import java.util.Scanner;

public class logicalOperatorsHomeWork2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер дня недели (от 1 до 7): ");
        int day = scanner.nextInt();

        if (day >= 1 && day <= 5) {
            System.out.println("Будний день");
        } else if (day == 6 || day == 7) {
            System.out.println("Выходной день");
        } else {
            System.out.println("Некорректный день");
        }
        
       scanner.close(); 
        
        
    }
	
	
	
	
	
	
}
