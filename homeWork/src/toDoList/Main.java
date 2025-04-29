package toDoList;

public class Main {
    public static void main(String[] args) {
		 TaskManager manager = new TaskManager();
		 
		 Task task1 = new Task("Java", "Создать новый Объект");
	     Task task2 = new Task("Front", "Создать новый Сайт");
	     Task task3 = new Task("Calculator", "Создать новый Калькулятор");
	 
	    System.err.println("Старый список");
		 
		manager.addTask(task1);
		manager.addTask(task2);
		manager.addTask(task3);
		
		manager.allTask();
		

		System.err.println("Новый список");
		manager.removeTask(2);
		manager.allTask();
		 
		
		manager.markAsComplated(0);
		System.out.println("Новый список -2");
		manager.allTask();
	}
}
