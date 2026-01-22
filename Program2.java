import java.util.Scanner;

class Program2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String firstname = scanner.next();
		System.out.print("Enter your last name: ");
		String lastname = scanner.next();
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		System.out.println("Fisrt Name: "+ firstname);
		System.out.println("Last Name: "+ lastname);
		System.out.println("Age: "+ age);
	}
}
