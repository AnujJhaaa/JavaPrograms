class Student {
    int rollNumber ;
    String name, course ;
    int[] subjectMarks = new int[5];

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
}