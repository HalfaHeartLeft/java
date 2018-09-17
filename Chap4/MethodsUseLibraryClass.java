import java.util.Scanner;
public class MethodsUseLibraryClass {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an integer: ");
		String str = input.nextLine();
		int num = Integer.parseInt(str);
		System.out.println(str + "! = " + MethodsLibrary.factorial(num));
		
	}
}


