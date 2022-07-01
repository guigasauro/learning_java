class Variable_swap{
	public static void main(String[] args){
		String x = "red";
		String y = "blue";

		System.out.println("This is x (before): "+ x);
		System.out.println("This is y (before): "+ y);

		String temp;

		temp = x;
		x = y;
		y = temp;

		System.out.println("\nSwapping variables...\n");

		System.out.println("This is x (after): "+ x);
		System.out.println("This is y (after): "+ y);
	}
}