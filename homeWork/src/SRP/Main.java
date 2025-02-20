package SRP;

public class Main {
	public static void main(String[] args) {
        Adder adder = new Adder();
        int result = adder.add(5, 3);

        Printer printer = new Printer();
        printer.print(result);
    }
}
