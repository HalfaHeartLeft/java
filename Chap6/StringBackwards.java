import java.util.Scanner;
public class StringBackwards {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		String [] strBackward = new String [str.length()];
		String result = "";
		
		for (int i = 0; i < strBackward.length; i++) {
			strBackward[strBackward.length - i - 1] = str.substring(i,i+1);
		}
		for (int i = 0; i < strBackward.length; i++) {
			result += strBackward[i];
		}
		System.out.print(result);
	}
}
