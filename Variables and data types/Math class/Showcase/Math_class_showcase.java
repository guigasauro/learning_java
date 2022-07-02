
// Showcasing some of the methods inside the math class
class Math_class_showcase{

	public static void main(String[] args){

		double x = 3.14;
		double y = -10;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		double z = Math.max(x, y);

		System.out.println("The biggest number between x and y is: " + z);

		z = Math.min(x, y);

		System.out.println("The smallest number between x and y is: " + z);

		z = Math.abs(y);

		System.out.println("The absolute value of y is: " + z);

		z = Math.sqrt(x);

		System.out.println("The square root of x is: " + z);

		z = Math.round(x);

		System.out.println("The rounding of x is: " + z);

		z = Math.ceil(x);

		System.out.println("The ceiling of x is: " + z);

		z = Math.floor(x);

		System.out.println("The flooring of x is: " + z);
	}
}