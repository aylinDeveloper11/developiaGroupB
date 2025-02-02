package Inheritance2;

public class Main {
    public static void main(String[] args) {

    	 Runner runner = new Runner();
         Swimmer swimmer = new Swimmer();

         runner.name = "Aylin";
         runner.distance = 5.0;

         swimmer.name = "Aylin";
         swimmer.swimTime = 30.0;
    	
         runner.train();
         runner.run();

         swimmer.train();
         swimmer.swim();
    	
    }
}
