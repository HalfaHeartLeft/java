ximport java.text.DecimalFormat;
import java.util.Scanner; 

public class CarSharing {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter driven kilometers: ");
		double distance = Double.parseDouble(input.nextLine().replace(",","."));
		
		System.out.print("Enter fuel consumption per 100 km: ");
		double fuel = Double.parseDouble(input.nextLine().replace(",", "."));
		
		System.out.print("Enter fuel price per liter: ");
		double fuelPrice = Double.parseDouble(input.nextLine().replace(",", "."));
		
		System.out.print("Enter number of people: ");
		int people = Integer.parseInt(input.nextLine());
		
		DecimalFormat twoDec = new DecimalFormat("0.00");
		double pricePerPerson = distance * fuel * fuelPrice / (people *100);
		
		System.out.println("\n" + "Each of the " + people + " people should pay " + twoDec.format(pricePerPerson) + " euros.");
		input.close();
	}
	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace('.', ','));
	}
}
