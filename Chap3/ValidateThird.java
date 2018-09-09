import java.util.Scanner;
public class ValidateThird {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = "";
		boolean isContinued = true;
	
		while (isContinued) {
			System.out.print("Enter grade (0-5): ");
			try {
				str = input.nextLine();
				int num = Integer.parseInt(str);
				if (num >= 0 && num <= 5) {
					System.out.println("OK");
					isContinued = false;
					
				} else if (num < 0 || num > 5) { 
					System.out.println(num + " is not a valid grade.");
				}
		}
			catch (NumberFormatException nfe) {
				System.out.println(str + " is not a valid grade.");
			}
		}	
	}
}
		
				
	
		

