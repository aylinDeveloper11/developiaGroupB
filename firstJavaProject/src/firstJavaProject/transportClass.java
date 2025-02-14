package firstJavaProject;

public class transportClass {
	public static void main(String[] args) {
		Transport transport = Transport.CAR;
		switch (transport) {
		case CAR:
			System.out.println("Едем на машине");
			break;
		case BUS:
			System.out.println("Едем на автобусе");
			break;
		case METRO:
			System.out.println("Едем на метро");

			break;
		case ONFOOT:
			System.out.println("Идём пешком");
			break;
		case PLANE:
			System.out.println("Мы летим");
			break;

//		default:
//			System.out.println("Никуда не идём");
//			break;
		}
	}
}
