import java.util.Scanner;
import java.text.DecimalFormat;

public class ArrayBloodTypes {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter blood type: ");
		String str = input.nextLine();
		DecimalFormat oneDec = new DecimalFormat("0.0");
		
		String[] array = {"A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O+", "AB+"};
		int aPlus = 0;
		int oMinus = 0;
		int abPlus = 0;
		int oPlus = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("A+")) {
				aPlus++;
			} else if (array[i].equals("O-")) {
				oMinus++;
			} else if (array[i].equals("AB+")) {
				abPlus++;
			} else if (array[i].equals("O+")) {
				oPlus++;
			}
		}
		
		if (str.equals("A+")) {
			System.out.println(oneDec.format(aPlus *100 / array.length) + "%");
		} else if (str.equalsIgnoreCase("O-")) {
			System.out.println(oneDec.format(oMinus *100 /array.length) + "%");
		} else if (str.equalsIgnoreCase("AB+")) {
			System.out.println(oneDec.format(abPlus *100 / array.length) + "%");
		} else if (str.equals("O+")) {
			System.out.println(oneDec.format(oPlus *100/ array.length) + "%");
		} else {
			System.out.println("0,0%");
		}
	}
	private static double readDouble (Scanner input) {
		return Double.parseDouble(input.nextLine().replace('.', ','));
	}
}
