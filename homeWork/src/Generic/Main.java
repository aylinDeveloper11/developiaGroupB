package Generic;

public class Main {
	  public static void main(String[] args) {
	        Triple<Integer, String, Double> triple = new Triple<>(12, "Aylin1", 3.14);
	        triple.printTriple();
	        triple.setFirst(13);
	        triple.setSecond("Aylin2");
	        triple.setThird(1982.8);
	        triple.printTriple();
	    }
}
