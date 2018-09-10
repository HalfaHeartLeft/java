	
	public class MethodsFirst {
		public static void main (String[] args) {
			printNumbers();
		}
		private static void printNumbers() {
			String result = 2 + " ";
			for (int i = 4; i > 2 && i <= 50; i+=2) {
				result += i + " ";
			}
			System.out.print(result);
		}
 	}

	
	