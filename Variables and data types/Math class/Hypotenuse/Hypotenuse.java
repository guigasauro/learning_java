import java.util.Scanner;

// This program calculates the hypotenuse of a right triangle,
// with the two sides' values inputted by the user
class Hypotenuse{
	public static void main(String[] args) {
		
		// Assigning the variables
		double x, y, z;

		// Initializing the Scanner object
		Scanner scanner = new Scanner(System.in);

		// Gathering the values inputted by the users
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();

		System.out.println("Enter side y: ");
		y = scanner.nextDouble();

		// Calculating the hypotenuse using the Pythagorean
		//	theorem and the sqrt method
		z = Math.sqrt((x*x) + (y*y));

		// Printing out the result
		System.out.println("The hypotenuse equals: " + z);

		// Closing the Scanner object
		scanner.close();
	}
}