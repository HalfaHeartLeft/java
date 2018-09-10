import java.util.Scanner;
public class MethodsSecond {
	public static void main (String[] args) {		
		printRectangle();
	}
	private static void printRectangle() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter width: ");
		int width = Integer.parseInt(input.nextLine());
		System.out.print("Enter height: ");
		int height = Integer.parseInt(input.nextLine());
		String result = "\n";
		for (int i = 0; i < height; i++) {
			for (int n = 0; n < width; n++) {
				 result += "x";
			}
			System.out.println(result);
			result = "";
		} 
	}
}
