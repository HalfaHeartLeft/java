import java.util.Scanner;
public class RegExValidateUsernameFormat {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter username: ");
		String str = input.nextLine();
		if (str.length() == 27) {
			if (str.substring(0,1).matches("a") 
				&& str.substring(1,8).matches("[0-9]{7}") 
				&& str.substring(8,12).matches("@myy")
				&& str.substring(12,13).matches("\\.")
				&& str.substring(13,24).matches("haaga-helia")
				&& str.substring(24,25).matches("\\.")
				&& str.substring(25,27).matches("fi")) {
			System.out.println("OK");
			} else {
				System.out.print("Invalid username format");
			}} 
		else {
			System.out.print("Invalid username format");
		}
	}
}
