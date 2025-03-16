package ComparableComparator;

import java.util.ArrayList;
import java.util.List;


public class Main {
public static void main(String[] args) {
	List<Computer> computers = new ArrayList<>();
	Computer computer1 = new Computer("Lenovo", 2500);
	Computer computer2 = new Computer("HP", 1500);
	Computer computer3 = new Computer("Asus", 1000);

   computers.add(computer1);
   computers.add(computer2);
   computers.add(computer3);
  System.out.println(computers);
  computers.sort(computer1);
  System.out.println(computers);

	
}
}
