import java.text.DecimalFormat;
import java.util.Scanner; 

public class DecimalPlaces {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a decimal number: ");
	DecimalFormat twoDecimals = new DecimalFormat("0.00");
	double num = readDouble(input);
	System.out.println(twoDecimals.format(num));
	
	}
	private static double readDouble(Scanner input) {
		 return Double.parseDouble(input.nextLine().replace(',', '.'));
		 }

}
