import java.util.Scanner;
public class RegExValidateStudentNumber {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter student number: ");
		String num = input.nextLine() + "";
			if (num.matches("[0-9]{7}")) {
				System.out.println("OK");
			} else {
				System.out.println("Invalid student number");
			}
		} 
	}
