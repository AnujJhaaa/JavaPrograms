import java.util.Scanner;

class Program3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter 1st number: ");
		int number1 = scanner.nextInt();
		System.out.print("Enter 2nd number: ");
		int number2 = scanner.nextInt();
		System.out.print("Enter Choice (1:Addition 2:Division 3:Substraction 4:Multiplication) : ");
		int choice = scanner.nextInt();

		int result = 0; //store the resut of the operation performed


		if (choice == 1) {
				result = number1 + number2;
				System.out.println("Sum = "+result);
		}
		
		if (choice == 2) {
				result = (number1 > number2) ? (number1 / number2) : (number2 / number1);
				System.out.println("Quotient = "+result);
		}

		if (choice == 3) {	
				result = (number1 > number2) ? (number1 - number2) : (number2 - number1);
				System.out.println("Difference = "+result);
		}

		if (choice == 4) {
				result = number1 * number2;
				System.out.println("Product = "+result);
		}
	}
}