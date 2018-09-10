import java.util.Scanner;
import java.text.DecimalFormat;
public class MethodsThird {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDec = new DecimalFormat("0.00");
		
		System.out.print("Enter gross salary: ");
		double grossSalary = Double.parseDouble(input.nextLine().replace(",","."));
		System.out.print("Enter income tax rate: ");
		double tax = Double.parseDouble(input.nextLine().replace(",","."));
		double netSalary = calculateNetSalary(grossSalary, tax);
		System.out.println("\n" + "The net salary is " + twoDec.format(netSalary));
	}
	private static double calculateNetSalary(double grossSalary, double tax) {
		return grossSalary - (grossSalary * tax / 100);
	}
}
