package Solutions;

public class p001 {
	
	public static String getSolution() {
		
		int sum = 0;
		
		for(int i = 1; i < 1000; i ++) {
			if(multipleOf(i, 3) || multipleOf(i, 5)) {
				sum += i;
			}
		}
		
		return String.valueOf(sum);
	}
	
	
	private static boolean multipleOf(int i, int factor) {
		return i%factor == 0;
	}
}
