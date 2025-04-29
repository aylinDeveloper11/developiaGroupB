package Additional;

public class LightBulb implements Switchable {
	 boolean isOn = false;
	 
	 @Override
	 public void switchOn() {
	        if (isOn) {
	            throw new IllegalStateException("Уже включена!");
	        }
	        isOn = true;
	        System.out.println("Включили лампочку.");
	    }
	 
	@Override
	public void switchOff() {
		  if (!isOn) {
	            throw new IllegalStateException("Уже выключена!");
	        }
	        isOn = false;
	        System.out.println("Выключили лампочку.");
		
	}

	public void getStatus() {
	    if (isOn) {
	        System.out.println("Лампочка включена.");
	    } else {
	        System.out.println("Лампочка выключена.");
	    }
	}


}
