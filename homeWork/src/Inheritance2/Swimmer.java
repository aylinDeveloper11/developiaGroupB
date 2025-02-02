package Inheritance2;

public class Swimmer extends Athlete {
    double swimTime;

    public void swim() {
        System.out.println("Пловец " + name + " проплыл за " + swimTime + " минут.");
    }
    
	
}
