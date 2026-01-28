class Student {
    int rollNumber ;
    String name, course ;
    int[] subjectMarks = new int[5];

    Student(int rNumber, String sName, String sCourse, int[] sMarks){
        rollNumber = rNumber;
        name = sName;
        course = sCourse;
        subjectMarks = sMarks;
    }
    Student() {}

    int calculateTotalMarks(){
        int total = 0;
        for(int marks : subjectMarks){ 
            total += marks;
        }

        return total;
    }

    double calculatePercentage() {
        int total = calculateTotalMarks();
        double percent = (total/500.0) * 100;

        return percent;
    }

    void viewInfo() {
        System.out.println("Name : " + name);
        System.out.println("Roll number : " + rollNumber);
        System.out.println("Course name : " + course);
        System.out.println();
    }
}