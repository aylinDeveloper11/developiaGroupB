package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Computer2> computers2 = new ArrayList<>();
		Computer2 comp1 = new Computer2("Lenovo", 2500);
		Computer2 comp2 = new Computer2("HP", 1500);
		Computer2 comp3 = new Computer2("Asus", 1000);
		
		computers2.add(comp1);
		computers2.add(comp2);
		computers2.add(comp3);
		 System.out.println(computers2);
		 Collections.sort(computers2);
		 System.out.println(computers2);





	}
}
