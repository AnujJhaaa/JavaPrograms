import java.util.Scanner;

class Program5array {
	static int[] subjectMarks;
	static int totalMarks;

	public static void main(String[] args) {
		takeInput();
		totalCalculate();
		generateOutput();
	}

	static void takeInput() {
		Scanner scanner = new Scanner(System.in);
		subjectMarks = new int[5];

		System.out.print("Enter the marks of subject 1: ");
		subjectMarks[0] = scanner.nextInt();
		System.out.print("Enter the marks of subject 2: ");
		subjectMarks[1] = scanner.nextInt();
		System.out.print("Enter the marks of subject 3: ");
		subjectMarks[2] = scanner.nextInt();
		System.out.print("Enter the marks of subject 4: ");
		subjectMarks[3] = scanner.nextInt();
		System.out.print("Enter the marks of subject 5: ");
		subjectMarks[4] = scanner.nextInt();
	}

	static void totalCalculate() {
		totalMarks = subjectMarks[0] + subjectMarks[1] + subjectMarks[2] + subjectMarks[3] + subjectMarks[4];
	}

	static void generateOutput() {
		System.out.println("Total marks =  " + totalMarks);
	}
}

