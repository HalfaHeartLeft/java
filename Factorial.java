import java.util.Scanner;
public class Factorial {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);

		try {
			System.out.print("Enter a non-negative integer: ");
			int num = Integer.parseInt(input.nextLine());
			int result = 1;
			if (num == 0) {
				result = 1;
				System.out.println(num + "! = " + result);
			} else if (num > 0) {
				for (int i = 1; i <= num; i++) {
					result *= i;
				}
				System.out.println(num + "! = " + result);
			} else {
					System.out.println("Please enter a non-negative integer.");
			}
		} 
		catch (NumberFormatException nfe) {
			System.out.println("Please enter a non-negative integer.");
		}
	}
}
