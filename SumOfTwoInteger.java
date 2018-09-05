import java.util.Scanner; 

public class SumOfTwoIntegers {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int firstNum = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter second integer: ");
		int secondNum = Integer.parseInt(input.nextLine());
		int sum = firstNum + secondNum;
		
		System.out.println(firstNum + " + " + secondNum + " = " + sum);
		input.close();
	}
}