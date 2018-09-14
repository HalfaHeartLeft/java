import java.util.Scanner;
import java.util.Arrays;

public class ArrayDescendingNumbers {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1. number: ");
		double num1 = Double.parseDouble(input.nextLine().replace(",","."));
		System.out.print("Enter 2. number: ");
		double num2 = Double.parseDouble(input.nextLine().replace(",","."));
		System.out.print("Enter 3. number: ");
		double num3 = Double.parseDouble(input.nextLine().replace(",","."));
		System.out.print("Enter 4. number: ");
		double num4 = Double.parseDouble(input.nextLine().replace(",","."));
		System.out.println("");
		
		double[] array = new double[4];
		array[0] = num1;
		array[1] = num2;
		array[2] = num3;
		array[3] = num4;
		
		Arrays.sort(array);
		for(int i = array.length - 1; i >= 0; i--){
		  System.out.print(array[i] + " ");
		}
		}
	}