import java.util.Scanner;
public class StringLettersAndDigits {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		String letter = str.replaceAll("\\s", "");
		String digit = str.replaceAll("[^0-9]", "");
		System.out.println(letter.length() + " letter(s)");
		System.out.print(digit.length() + " digit(s)");
	}
}
