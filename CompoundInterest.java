import java.util.Scanner;
import java.text.DecimalFormat;
public class CompoundInterest {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDec = new DecimalFormat("0.00");
		
		System.out.print("Enter initial deposit: ");
		double deposit = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter interest rate: ");
		double interest = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter capital income tax rate: ");
		double tax = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter number of years: ");
		int year = Integer.parseInt(input.nextLine());
		System.out.print("\n");
		
		for (int i = 1; i <= year; i++) {
			double result = calculation (deposit, interest, tax, year);
			System.out.println(i + ": " + twoDec.format(result));
			deposit = result;
		}
		
	}
	private static double calculation (double deposit, double interest, double tax, int year) {
		return deposit + (deposit * interest / 100) - (deposit * interest /100 * tax /100);
	}
	private static double readDouble(Scanner input) {
		 return Double.parseDouble(input.nextLine().replace('.', ','));
		 }
}
