package firstJavaProject;

public class MetodsLesson1 {

	public static void main(String[] args) {
		MetodsLesson1 metods = new MetodsLesson1();
		
		System.out.println(metods.sth(11, 2));
		metods.isEven(678292);
		
	}
	
	public int sth (int a, int b) {
		int results = a * b;
		return results;
	}

	public void isEven(int a) {
		if (a%2 == 0) {
			System.out.println("Число чётное");
		}else {
			System.out.println("Число нечётное");
		}
		
	}
	
}
