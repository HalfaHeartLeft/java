import java.util.Scanner;
public class RegExVowelsOnly {
	public static void main (String[] args)  {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		String[] vowels = {"a", "o", "u", "i", "e", "y", "ö", "ä", "å"};
		int vowelCount = 0;
		
		for (int i = 0; i < str.length(); i++) {
			for (int n = 0; n < vowels.length; n++) {
				if (str.toLowerCase().substring(i,i+1).matches(vowels[n])) {
					vowelCount++;
				}
			}
		}
		if (vowelCount == str.length()) {
			System.out.println("Vowels only");
		} else {
			System.out.println("Not only vowels!");
		}
	}
}
