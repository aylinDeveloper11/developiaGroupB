package firstJavaProject;

public class Student {
	String name;    
    int age;
    double grade;
    
    public Student() {
        name = "Unknown";
        age = 0;
        grade = 0.0;
    }
    
    
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    
}
    
    
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.name + " " + student1.age + " " + student1.grade);

        Student student2 = new Student("Aylin", 12, 100.0);
        System.out.println(student2.name + " " + student2.age + " " + student2.grade );
    }

}
