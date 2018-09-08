import java.util.Scanner;
public class StringLength {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String arr = input.nextLine();
		int length = arr.length();
		String vip = "quit";
		
		if (arr.toLowerCase().equals("quit")) {
			System.out.println("\n" +"The total length is " + (length - 4));
		} else {
			while (!arr.toLowerCase().equals(vip)) {
				System.out.print("Enter a string: ");
				arr = input.nextLine();
				length += arr.length();
			}
			System.out.println("\n" + "The total length is " + (length - vip.length()));
		} 
	}
}
