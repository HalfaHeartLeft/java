import java.text.DecimalFormat;
import java.util.Scanner; 

public class DrivingCost {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter driven kilometers: ");
		double distance = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter amount of fuel consumed: ");
		double fuel = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter fuel price per litter: ");
		double fuelPrice = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		double cost = (fuel * fuelPrice) / distance;
		
		System.out.println("The cost per kilometer is " + twoDecimals.format(cost)+ " euros.");
		input.close();
	}
}