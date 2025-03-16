package ComparableComparator;

import java.util.Comparator;

public class Computer implements Comparator<Computer> {
 String compBrand;
 int compPrice;
 

public Computer(String compBrand, int compPrice) {
	this.compBrand = compBrand;
	this.compPrice = compPrice;
}
 
 
@Override
public String toString() {
	return "Computer [compBrand=" + compBrand + ", compPrice=" + compPrice + "]";
}


@Override
public int compare(Computer c1, Computer c2) {
	// TODO Auto-generated method stub
	return c1.compBrand.compareTo(c2.compBrand);
}

 
 
}
