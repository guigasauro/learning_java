import java.util.Random;

class Random_library{
	public static void main(String[] args) {
		
		Random random = new Random();

		int x = random.nextInt();

		System.out.println(x);

		x = random.nextInt(20);

		System.out.println(x);

		double y = random.nextDouble();

		System.out.println(y);

		boolean z = random.nextBoolean();

		System.out.println(z);
	}
}