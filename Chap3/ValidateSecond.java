import java.util.Scanner;
public class ValidateSecond {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		try {
		System.out.print("Enter grade (0-5): ");
		int num = Integer.parseInt(input.nextLine());
		if (num >= 0 && num <= 5) {
			System.out.println("OK");
		} else {
			System.out.println("Please enter an integer between 0 and 5.");
		}
		} catch (NumberFormatException nfe) {
			System.out.println("Please enter an integer between 0 and 5.");
		}
	}
}
