import java.util.Scanner;

class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter your Roll Number : ");
        student.rollNumber = scanner.nextInt();
        
        scanner.nextLine();

        System.out.print("Enter your name : ");
        student.name = scanner.nextLine();
        System.out.print("Enter your Course : ");
        student.course = scanner.nextLine();

         for(int num=0;num<5;num++) {
            System.out.print("Enter subject " + (num+1) + " marks : ");
            student.subjectMarks[num] = scanner.nextInt();
         }
        
         System.out.println();

         int total = student.calculateTotalMarks();
         double percent = student.calculatePercentage();
         
         System.out.println("Total marks  = " + total);
         System.out.println("Percentage  = " + percent + "%");
    }
    
}
