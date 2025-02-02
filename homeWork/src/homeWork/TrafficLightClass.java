package homeWork;

public class TrafficLightClass {
public static void main(String[] args) {
	TrafficLight light = TrafficLight.YELLOW;
	
	switch (light) {
	case RED:
		System.out.println("Остановитесь");
		break;
		
case YELLOW:
	System.out.println("Приготовьтесь");
		break;
		
case GREEN:
	System.out.println("Можно ехать");
	break;

	default:
		System.out.println("Вы не в машине");
		break;
	}
}
}
