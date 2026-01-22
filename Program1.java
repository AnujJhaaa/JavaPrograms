import java.util.Scanner;

class Program1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = scanner.next();
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		
		System.out.println("Your name is " + name);
		System.out.println("Your age is " + age);
	}
}