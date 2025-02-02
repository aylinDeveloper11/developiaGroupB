package Encapsulation;

public class studentMain {
   public static void main(String[] args) {
       Student student = new Student();
       student.setName("Aylin");
		student.setAge(12);
		student.updateGpa(3.9);
	
		System.out.println("Имя: " + student.getName());
		System.out.println("Возраст: " + student.getAge());
		System.out.println("Средний балл: " + student.getGpa());

}

}
