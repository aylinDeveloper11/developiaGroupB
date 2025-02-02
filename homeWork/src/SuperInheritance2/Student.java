package SuperInheritance2;

public class Student extends Person {
	
	 public Student(String name) {
	        super(name);
	 }
	 
	    @Override
	    public void introduce() {
	        super.introduce();
	        System.out.println("I am student");
	    }

}
