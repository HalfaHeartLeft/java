import java.util.Scanner;
public class StringCount {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String stringInput = input.nextLine();
		int stringCount =  0;
		
		if (stringInput.equals("")) {
			System.out.println("0 string");
		} else {
			while (!stringInput.equals("") ) {
				stringCount++;
				System.out.print("Enter a string: ");
		        stringInput = input.nextLine();
			}
		} System.out.println(stringCount + " strings");
	} 
}
