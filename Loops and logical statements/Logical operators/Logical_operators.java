import java.util.Scanner;

class Logical_operators{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the game!");
		System.out.println("To play the game, you will need to answer two questions correctly...");

		System.out.println("First question: What is 4 + 5 ?");
		int q1 = scanner.nextInt();

		System.out.println("Next question: What is 3 * 8 ?");
		int q2 = scanner.nextInt();

		// The logical operator AND (&&) will only be true if
		// both conditions are true
		if(q1 == 9 && q2 == 24){
			System.out.println("You are playing a game, Press q or Q to quit!");
			String response = scanner.next();

			// The logical operator OR (||) will be true if
			// at least one of the conditions is true
			if(response.equals("q") || response.equals("Q")){
				System.out.println("You have quit the game!");
			}else{
				System.out.println("You are still playing the game!");
				System.out.println("Next question: Which letter comes after F?");
				String q3 = scanner.next();

				// The logical operator NOT (!) reverses the boolean value of a condition
				// In this example, the condition (q3.equals("g") || q3.equals("G")) is reversed,
				// which means not only the individual conditions need to be reversed, but the
				// logical operator too (&& is the opposite of || in logical terms)
				if(!q3.equals("g") && !q3.equals("G")){
					System.out.println("You are incorrect! Game over! :(");
				}else{
					System.out.println("You won the game!");
				}
			}
		}else{
			System.out.println("You are incorrect! Game over! :(");
		}

		
	}
}