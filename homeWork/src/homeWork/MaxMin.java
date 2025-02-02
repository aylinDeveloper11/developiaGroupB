package homeWork;

public class MaxMin {
	  public static void main(String[] args) {
	        int[] numbers = {12, 34, 7, 25, 56, 1};
	        int max = numbers[0];
	        int min = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > max) {
	                max = numbers[i];
	            }
	            if (numbers[i] < min) {
	                min = numbers[i];
	            }
	        }

	        System.out.println("Максимальное значение: " + max);
	        System.out.println("Минимальное значение: " + min);
	    }
	}

