import java.util.Scanner;

public class StringPassword {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter username: ");
		String username = input.nextLine();
		System.out.print("Enter password: ");
		String password = input.nextLine();
		if (validatePassword(password, username)) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}
	}
	private static boolean validatePassword (String password, String username) {
		int count = password.length();
		if (!password.contains(username.toLowerCase()) && count >= 8) {
			return true;
		} else {
			return false;
		}
	}
}
