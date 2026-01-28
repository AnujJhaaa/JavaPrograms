import java.util.Scanner;

class MainProgram2  {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.rollNumber = 001;
        student1.name = "Student1";
        student1.course = "Java Full Stack";

        Student student2 = new Student();
        student2.rollNumber = 002;
        student2.name = "Student2";
        student2.course = "Python";
        
        Student student3 = new Student();
        student3.rollNumber = 003;
        student3.name = "Student3";
        student3.course = "PHP";
        
        Student student4 = new Student();
        student4.rollNumber = 004;
        student4.name = "Student4";
        student4.course = "Java Full Stack";
        
        Student student5 = new Student();
        student5.rollNumber = 005;
        student5.name = "Student5";
        student5.course = "Java Full Stack";

        student1.viewInfo();
        student2.viewInfo();
        student3.viewInfo();
        student4.viewInfo();
        student5.viewInfo();

        
    }
}
