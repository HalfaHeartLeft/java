import java.util.Scanner;
import java.text.DecimalFormat;
public class AverageOfDecimalValues {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		DecimalFormat twoDec = new DecimalFormat("0.00");
		
		System.out.print("Enter first number (zero ends): ");
		double num = Double.parseDouble(input.nextLine().replace(",","."));
		double total = 0;
		int counter = 0;
		
		if (num == 0) {
			System.out.print("Nothing to calculate");
		}
		else {
			while (num != 0) {
				total += num;
				counter++;
				System.out.print("Enter next number (zero ends): ");
		        num = input.nextDouble();
			}
			double average = total / counter;
			System.out.println("The average is " + twoDec.format(average));
		}		
	}
	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace('.', ','));
	}
}	
