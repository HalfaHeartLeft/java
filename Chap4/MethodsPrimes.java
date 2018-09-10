
public class MethodsPrimes {
	public static void main (String[] args) {
		
		int totalNum = 20;
		int startNum = 2;
		int counter = 1;
		
		while (counter <= totalNum) {
			if (isPrime(startNum)) {
				counter++;
				System.out.print(startNum + " ");
			}
			startNum++;
		}
	}

	private static boolean isPrime(int primeNum) {
		 
		for (int i = 2; i <= primeNum / 2; i++) {
			if (primeNum % i == 0) {
				return false; 
			}
		} 	return true; }
}
