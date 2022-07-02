
// Swapping the value of two variables
class Variable_swap{
	public static void main(String[] args){

		// Assigning the variables
		String x = "red";
		String y = "blue";

		// Printing how they are before the swap
		System.out.println("This is x (before): "+ x);
		System.out.println("This is y (before): "+ y);

		// Assigning a temporary variable to receive a value from
		// a variable that is being swapped. If we tried to swap
		// the values without this variable, both would have the
		// same value
		String temp;


		// Assigning x's value to the temporary variable
		temp = x;

		// Swapping the values correctly
		x = y;
		y = temp;

		System.out.println("\nSwapping variables...\n");


		// Printing the variables after the swap
		System.out.println("This is x (after): "+ x);
		System.out.println("This is y (after): "+ y);
	}
}