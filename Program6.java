import java.util.Scanner;

class Program6 {
    static int numberOfSubjects = 5;
    static int subject1Marks, subject2Marks, subject3Marks, subject4Marks, subject5Marks;
    static int[] subjectMarks ;

    static void takeInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks of subject 1: ");
        subject1Marks = scanner.nextInt();
		System.out.print("Enter the marks of subject 2: ");
		subject2Marks = scanner.nextInt();
		System.out.print("Enter the marks of subject 3: ");
		subject3Marks = scanner.nextInt();
		System.out.print("Enter the marks of subject 4: ");
		subject4Marks = scanner.nextInt();
		System.out.print("Enter the marks of subject 5: ");
		subject5Marks = scanner.nextInt();
	}

    static void storeMarks() {
        subjectMarks = new int[] {subject1Marks, subject2Marks, subject3Marks, subject4Marks, subject5Marks};
    }

    static void printMarks(){
        System.out.println();
        int countSubject=0;

        for (int marks : subjectMarks) {
            countSubject++;
            System.out.println("Subject " + countSubject + " Marks : " + marks);
        }
    }

    static void printHighestMark() {
        int maxMarks = 0;
        for(int marks : subjectMarks) {
            if(marks > maxMarks) {
                maxMarks = marks;
            }
        }
        System.out.println("Your highest mark is " + maxMarks);
    }
    static void printLowesttMark() {
        int minMarks = subjectMarks[0];
        for(int marks : subjectMarks) {
            if(minMarks > marks) {
                minMarks = marks;
            }
        }
        System.out.println("Your lowest mark is " + minMarks);
    }

    public static void main(String[] args) {
        takeInput();
        storeMarks();
        printMarks();
        printHighestMark();
        printLowesttMark();
    }
}