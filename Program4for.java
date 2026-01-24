import java.util.Scanner;

class Program4for {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int num = 0; num < 5; num++) {
			System.out.print("Enter your first name: ");
			String firstName = scanner.next();
                	System.out.print("Enter your last name: ");
                	String lastName = scanner.next();
			System.out.print("Enter your age: ");
			int age = scanner.nextInt();
		
			System.out.println();

                	System.out.println("Your name is " + firstName + " " + lastName + ".");
			System.out.println("Your age is " + age);
			
			System.out.println();
		}
	}

}
                
