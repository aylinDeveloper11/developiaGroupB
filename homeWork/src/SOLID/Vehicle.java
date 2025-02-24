package SOLID;

public sealed class Vehicle permits Car,Bicycle {
    public void move() {
	}
}
