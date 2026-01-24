import java.util.Scanner;

class Program5 {
	static int subject1Marks, subject2Marks, subject3Marks, subject4Marks, subject5Marks;
	static int totalMarks;

	public static void main(String[] args) {
		takeInput();
		totalCalculate();
		generateOutput();
	}

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

	static void totalCalculate() {
		totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks;
	}

	static void generateOutput() {
		System.out.println("Total marks =  " + totalMarks);
	}
}

