import java.util.Scanner;
public class RegExValidateSize {
	public static void main (String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size: ");
		String inputStr = input.nextLine();
		String[] sizes = {"XS", "S", "M", "L", "XL"};
		String result = "Invalid size";
		
		for (int i = 0; i < sizes.length; i++) {
			if (inputStr.trim().matches(sizes[i])) {
				result = "OK";
			}
		} System.out.println(result);
	}
}
