package Solutions;

import java.math.BigInteger;

public class p055 {
	
	public static String getSolution() {
		
		int numLychrel = 0;
		
		for(int k = 1; k < 10000; k ++) {
			boolean lychrel = false;
			BigInteger num = BigInteger.valueOf(k);
			for(int i = 0; i < 50; i ++) {
				num = num.add(getReverse(num));
				if(num.compareTo(getReverse(num)) != 0) {
					lychrel = true;
				} else {
					lychrel = false; 
					break;
				}
			}
			
			if(lychrel) numLychrel ++;
		}
		
		return String.valueOf(numLychrel);
				
	}
	
	public static BigInteger exponent(int base, int exp) {
		BigInteger retVal = BigInteger.ONE;
		for(int i = 0; i < exp; i ++) {
			retVal = retVal.multiply(BigInteger.valueOf(base));
		}
		return retVal;
	}
	
	public static BigInteger getReverse(BigInteger x) {
		
		BigInteger index = BigInteger.ONE;
		int mag = 0;
		while(x.compareTo(index) >= 0) {
			index = index.multiply(BigInteger.TEN);
			mag ++;
		}
		
		BigInteger[] digits = new BigInteger[mag];
 		for(int i = 1; i <= mag; i ++) {
			digits[i-1] = (x.mod(exponent(10, i))).divide(exponent(10, i-1));
		}
 		
 		BigInteger retVal = BigInteger.ZERO;
		
		for(int i = digits.length; i > 0; i --) {
			BigInteger factor = exponent(10, i-1);
			retVal = retVal.add(factor.multiply(digits[digits.length-i]));
		}
		
		return retVal;
	}
}
