package Solutions;

public class p003 {

	private static double num = 600851475143d;
	
	public static String getSolution() {
		
		int solution = 0;
		
		for(int i = 2; i <= Math.sqrt(num); i ++) {
			if(num % i == 0 & isPrime(i)) {
				solution = i;
			}
		}
		
		return String.valueOf(solution);
		
	}
	
	
	public static boolean isPrime(int x) {
		
		int checkUpTo = (int)(Math.sqrt(x)) + 1;
		for(int i = 2; i <= checkUpTo; i ++) {
			if(x%i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
