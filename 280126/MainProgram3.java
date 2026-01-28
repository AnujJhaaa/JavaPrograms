class MainProgram3 {
    public static void main(String[] args) {
        Student student = new Student(001,
                                    "Student1",
                                    "Full Stack", 
                                    new int[] {11,22,33,44,55});
        
            student.viewInfo();
            
            int total = student.calculateTotalMarks();
            System.out.println("Total marks obatianed is " + total );
    }
    
}
