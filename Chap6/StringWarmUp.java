import java.util.Scanner;
public class StringWarmUp {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		int count = str.length();
		System.out.println(count + " characters");
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}
}
