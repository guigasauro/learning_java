class Switches{
	public static void main(String[] args) {

		String day = "Friday";

		// A switch is a statement that allows a variable to be tested
		// for equality against a list of values


		// Here we specify the variable that is being tested
		switch(day){

			// And the values that it will be tested for
			case "Sunday": System.out.println("It is Sunday!");
			// This break statement is needed to prevent the
			// switch from going through all the cases
			break;

			case "Monday": System.out.println("It is Monday!");
			break;

			case "Tuesday": System.out.println("It is Tuesday!");
			break;

			case "Wednesday": System.out.println("It is Wednesday!");
			break;

			case "Thursday": System.out.println("It is Thursday!");
			break;

			case "Friday": System.out.println("It is Friday!");
			break;
			
			case "Saturday": System.out.println("It is Friday!");
			break;

			default: System.out.println("That is not a day");
		}
	}
}