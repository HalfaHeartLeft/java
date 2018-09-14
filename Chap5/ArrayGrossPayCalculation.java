import java.util.Scanner;
import java.util.Arrays; 
import java.text.DecimalFormat;
public class ArrayGrossPayCalculation {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecs = new DecimalFormat("0.00");
		System.out.print("Enter your hourly wage: ");
		double hourlyWage = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter the number of days: ");
		int days = Integer.parseInt(input.nextLine());
		int [] array = new int [days];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Hours worked on day " + (i+1) + ": ");
			array[i] = Integer.parseInt(input.nextLine());}
		
		System.out.println("");
		int totalHours = 0;
		for (int n = 0; n < array.length; n ++) {
			totalHours += array[n];
		} System.out.println("Total work hours is " + totalHours);
		
		double [] dailyPay = new double [days]; 
		for (int p = 0; p < array.length; p++) {
			if (array[p] <= 8) {
				dailyPay[p] = array[p] * hourlyWage; 
			} else {
				dailyPay[p] = array[p]*hourlyWage + (array[p]-8)*hourlyWage/2; 
			}}
		
		double totalPay = 0;
		for (int m = 0; m < dailyPay.length; m++) {
			totalPay += dailyPay[m];
		} System.out.print("Gross pay is " + twoDecs.format(totalPay)+"\n");
		
		String dailyHours = "";
		for (int k = 0; k < array.length; k++) {
			dailyHours += " " + array[k];
		} System.out.println("You entered the following daily hours:" + dailyHours);
	}	
	private static double readDouble(Scanner input) {
		 return Double.parseDouble(input.nextLine().replace(',', '.'));
		 }
}