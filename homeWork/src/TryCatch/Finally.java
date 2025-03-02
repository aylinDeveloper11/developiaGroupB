package TryCatch;

public class Finally {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
	        System.err.println("блок catch");
		}finally {
	        System.out.println("блок finally");
		}
		
	}
}
