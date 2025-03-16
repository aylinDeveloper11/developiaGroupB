package ComparableComparator;

public class Computer2 implements Comparable<Computer2> {
	 String compBrand;
	 int compPrice;
	 

	public Computer2(String compBrand, int compPrice) {
		this.compBrand = compBrand;
		this.compPrice = compPrice;
	}
	 
	 
	@Override
	public String toString() {
		return "Computer [compBrand=" + compBrand + ", compPrice=" + compPrice + "]";
	}


	@Override
	public int compareTo(Computer2 o) {
		// TODO Auto-generated method stub
		return this.compPrice- o.compPrice;
	}


}
