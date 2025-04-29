package toDoList;

import java.util.ArrayList;

public class TaskManager {
	 private ArrayList<Task> tasks = new ArrayList<>();
	 
	   public void addTask(Task task) {
		tasks.add(task);
	    }
		
	   
	   public void removeTask(int id) {
		    tasks.remove(id);
	    }
	   
	   
	        public void allTask() {
		       for (Task task : tasks) {
			      System.out.println(task.toString());
		      }
	     }
	        
	        public  void markAsComplated(int id) {
				for (Task task : tasks) {
					if (task.getID() == id) {
						task.markAsCompleted();
						return;
					}
				}
			}
	        
}
