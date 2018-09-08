import java.util.Scanner;
public class DescendingIntegers {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = Integer.parseInt(input.nextLine());
		for (int x = num; x > 0; x--) 	{
			System.out.print(x + " ");
		}	
	input.close();
	}
}
