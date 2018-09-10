
public class MethodsFactorial {
	public static void main (String[] args) {
		int num = 9;
		int answer;
		for (int i = 1; i <= num; i++) {
			answer = factorial(i);
			System.out.println(i + "! = " + answer);
		}
	}
	private static int factorial(int i) {
		int result = 1;
		for (int n = 1; n <= i; n++) {
			result *= n;
		}
		return result;
	}
  }
