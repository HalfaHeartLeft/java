import java.util.Scanner;
public class ArrayLanguageTranslation {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an English word: ");
		String strEng  = input.nextLine();
		
		String [] arrEng = {"bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher"};
		String [] arrFin = {"lintu", "bussi", "auto", "kissa", "koira", "koulu", "kiitos", "juna", "opettaja"};
		
		String result = "";
			for (int i = 0; i < arrEng.length; i++) {
				if(strEng.equalsIgnoreCase(arrEng[i])) {
					result = arrFin[i];
					break;
				} else {
					result = "Unknown word";
				}
			} System.out.print(result);
		} 
	}
