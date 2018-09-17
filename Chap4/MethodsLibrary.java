
public class MethodsLibrary {
	
	public static int factorial(int num) {
			int result = 1;
			if (num == 0) {
				result = 1;
			} else if (num > 0) {
				for (int i = 1; i <= num; i++) {
					result *= i;
				}
			} else {
				System.out.println("Please enter an integer.");		
			}
			return result;
		}
}

