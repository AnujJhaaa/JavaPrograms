import java.util.Scanner;

class Program4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstName = scanner.next();
                System.out.print("Enter your last name: ");
                String lastName = scanner.next();
		
		System.out.println();

                System.out.println("Your name is " + firstName + " " + lastName + ".");
	}
}
                
