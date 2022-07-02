class If_statements{
	public static void main(String[] args) {
		int age = 61;

		// The if statement checks the value of the variable "age"
		// and prints the following message if the statement is true
		if(age >= 75){
			System.out.println("OK boomer!");

		// Additional condition by the "else if" statement, following the same logic
		}else if(age >= 18){
			System.out.println("You are an adult!");

		// If none of the previous conditions are met, the "else" statement
		// sets what will happen in the program
		}else{
			System.out.println("You are not an adult!");
		}
	}
}