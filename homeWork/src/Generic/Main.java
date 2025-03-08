package Generic;

public class Main {
	  public static void main(String[] args) {
	        Triple<Integer, String, Double> triple = new Triple<>(13, "Aylin1", 3.14);
	        triple.printTriple();
	        triple.setFirst(12);
	        triple.setSecond("Aylin2");
	        triple.setThird(1982.8);
	        triple.printTriple();
	    }
}
