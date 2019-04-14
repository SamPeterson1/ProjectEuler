package Solutions;

public class p002 {

	public static String getSolution() {
		
		int a=1, b=0, c=0;
		int sum = 0;
		
		for(int i = 0; i < 40; i ++) {
			c = a;
			a = a+b;
			b = c;
			
			if(a > 4000000) {
				return String.valueOf(sum);
			} else if(a % 2 == 0){
				sum += a;;;
			}
		}
		
		return null;
		
	}
	
}
