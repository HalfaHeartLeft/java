import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodsMax {
  public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first double: ");
    double num1 = Double.parseDouble(input.nextLine().replace(',', '.'));
    System.out.print("Enter second double: ");
    double num2 = Double.parseDouble(input.nextLine().replace(',', '.'));
    
    double maxNum = max(num1, num2);
    System.out.println("\n" + "The max value is " + maxNum);
  }
  private static double max(double num1, double num2) {
    if (num1 > num2) {
      return num1;
    } else {
      return num2;
    }
  }
}
