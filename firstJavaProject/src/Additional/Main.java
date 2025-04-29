package Additional;

public class Main {
public static void main(String[] args) {
	LightBulb bulb = new LightBulb();
	
    bulb.getStatus();
    bulb.switchOn();         
    bulb.getStatus();  
    
    try {
        bulb.switchOn();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    
    bulb.switchOff();  
    bulb.getStatus(); 
    
    
}
}
