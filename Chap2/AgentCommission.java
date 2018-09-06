import java.text.DecimalFormat;
import java.util.Scanner; 

public class AgentCommission {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter selling price: ");
		double price = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		double commission = price * 3.44 /100;
		
		if (commission > 2400) {
			System.out.println("The commission is " + twoDecimals.format(commission) + " euros.");
		} else {
			System.out.println("The commission is 2400,00 euros.");
		}
		input.close();
	}
	private static double readDouble(Scanner input) {
		 return Double.parseDouble(input.nextLine().replace('.', ','));
		 }
}