import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		String choice = "yes";

		while (choice.equalsIgnoreCase("yes")) {
			System.out.println("Please enter a number between 1 and 10.");
			int input = scan1.nextInt();
			scan1.nextLine();

			if (input > 10 || input < 1) {

				System.out.println("This number is not between 1 and 10.");

			} else {
				System.out.println("The factorial of your number is:");
				getFactorial(input);

			}

			System.out.println("Continue? Enter yes or no:");
			choice = scan1.nextLine();

		}
		scan1.close();
	}

	public static void getFactorial(int x) {

		long result = 1;

		for (int i = 1; i <= x; i++) {

			result = result * i;
			System.out.println(i + "! = " + result);
		}

	}
}
