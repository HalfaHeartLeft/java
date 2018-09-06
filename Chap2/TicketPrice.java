import java.text.DecimalFormat;
import java.util.Scanner;

public class TicketPrice {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter price for a single ticket: ");
		double singleTicket = Double.parseDouble(input.nextLine().replace(",", "."));
		
		System.out.print("Enter price for a season ticket: ");
		double seasonTicket = Double.parseDouble(input.nextLine().replace(",", "."));
		
		System.out.print("Enter the number of bus trips per month: ");
		int busTrip = Integer.parseInt(input.nextLine());
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		double singlePrice = singleTicket * busTrip;
		double singleCheaper = seasonTicket - singlePrice;
		double seasonCheaper = singlePrice - seasonTicket;
		
		if (singlePrice > seasonTicket) {
			System.out.println("Buying a season ticket is " + twoDecimals.format(seasonCheaper) + " euros cheaper.");
		} else if (singlePrice < seasonTicket) {
			System.out.println("Buying single tickets is " + twoDecimals.format(singleCheaper) + " euros cheaper.");
		} else {
			System.out.println("There is no difference in the price.");
		}
		input.close();
	}
	private static double readDouble(Scanner input) {
		 return Double.parseDouble(input.nextLine().replace('.', ','));
		 }
}
