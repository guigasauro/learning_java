
// This is a java library used to present pseudorandom numbers for the code
import java.util.Random;

class Random_library{
	public static void main(String[] args) {
		
		// Initializing a new random object
		Random random = new Random();

		// The nextInt function returns a random integer value
		int x = random.nextInt();

		System.out.println(x);

		// Passing an integer parameter to the nextInt function
		// limits its range. In this case, x will be a random number
		// between 0 and 20
		x = random.nextInt(20);

		System.out.println(x);

		// The nextDouble function returns a random double value
		// between 0 and 1
		double y = random.nextDouble();

		System.out.println(y);

		// The nextBoolean function returns a random boolean value
		boolean z = random.nextBoolean();

		System.out.println(z);
	}
}