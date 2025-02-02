package SuperInheritance3;

public class Manager extends Employee {
	
  private int teamSize;
    
    public Manager(String name, String position, int teamSize) {
        super(name, position);
        this.teamSize = teamSize;
    }
    
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Размер команды: " + teamSize);
    }

}
