
// This is a library primarily used to receive user input by the terminal
import java.util.Scanner;

class User_input{
	public static void main(String[] args){

		// Initializing a new Scanner object
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your name: ");

		// Reading the input by the user
		String name = scanner.nextLine();

		System.out.println("Hello, "+ name);
	}
}