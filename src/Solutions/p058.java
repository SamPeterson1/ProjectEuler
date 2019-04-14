package Solutions;

public class p058 {
	
	public static String getSolution() {
		
		int temp1 = 5;
		int temp2 = 3;
		int temp4 = 7;
		int numPrimes = 0;
		
		for(int N = 1; N <= 50000; N ++) {		 	
			
			if(isPrime((2*N+1)*(2*N+1))) numPrimes++;
			if(isPrime(temp1)) numPrimes++;
			if(isPrime(temp2)) numPrimes++;
			if(isPrime(temp4)) numPrimes++;
			
			temp1 = temp1 + 8*N + 4;
			temp2 = temp2 + 8*N + 2;
			temp4 = temp4 + 8*N + 6;
			
			if(numPrimes/(N*4f+1f) < 0.1f) {
				return String.valueOf(N*2+1);
			}

		}
		
		return null;
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
