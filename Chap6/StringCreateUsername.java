import java.util.Scanner;
public class StringCreateUsername {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter first name: ");
		String firstName = input.nextLine();
		System.out.print("Enter surname: ");
		String surName = input.nextLine();
		String username = "";
		if (createUsername(firstName, surName, username) != null) {
			System.out.println(createUsername(firstName, surName, username));
		} else {
			System.out.println("Not enough letters to create a username!");
		}
	}
	
	private static Object createUsername (String firstName, String surName, String username) {
		if (surName.length() >= 3 && firstName.length() >= 2) {
			return username = surName.toLowerCase().substring(0, 3) + firstName.toLowerCase().substring(0, 2);
		} else {
			return null;
			}
		}
	}
