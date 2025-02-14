package OOP2;

public class Main {
	public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        car.start();
        car.stop();

        bicycle.start();
        bicycle.stop();
    }
}
