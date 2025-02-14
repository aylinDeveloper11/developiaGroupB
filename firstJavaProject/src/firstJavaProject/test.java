package firstJavaProject;

public class test {
	 public static void main(String[] args) {
		  int[] array = new int[10];
	        for (int i = 0; i < array.length; i++) {
	            array[i] = i + 1;
	        }
	        
	        int maxValue = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > maxValue) {
	                maxValue = array[i];
	            }
	        }
	        System.out.println("Максимальное число в массиве: " + maxValue);
	 }
}
