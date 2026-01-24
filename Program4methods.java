import java.util.Scanner;

class Program4methods{
	static String firstName, lastName;
	static int age;

	public static void main(String[] args) {
		for (int num = 0; num < 5; num++) {
			takeInput();
			System.out.println();

			generateOutput();
			System.out.println();
		}
	}

	static void takeInput() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		firstName = scanner.next();
                System.out.print("Enter your last name: ");
                lastName = scanner.next();
		System.out.print("Enter your age: ");
		age = scanner.nextInt();
	}

	static void generateOutput() {		
		System.out.println("Your name is " + firstName + " " + lastName + ".");
		System.out.println("Your age is " + age);
	}

}
                
