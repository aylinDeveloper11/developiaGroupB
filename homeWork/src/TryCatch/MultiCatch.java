package TryCatch;

public class MultiCatch {
public static void main(String[] args) {
	try {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(numbers[12]);
		System.out.println(10/0);
		
	} catch (ArithmeticException e) {
	    System.out.println("Ошибка на ноль не делится");
	}catch (IndexOutOfBoundsException e) {
        System.err.println("шибка выход за предел массива");
	}catch (NullPointerException e) {
        System.err.println("Ошибка обращения к null объекту ");
	}

	
}
}
