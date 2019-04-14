package Main;

import Checking.Checker;
import Solutions.*;

public class Main {

	public static void main(String[] args) {
		
		Checker.init();
		
		long startTime = System.currentTimeMillis();
		
		String solution = p002.getSolution();
		long deltaTime = System.currentTimeMillis() - startTime;
		
		if(solution != null) {
			if(Checker.isCorrect(2, solution)) {
				System.out.println("Correct! Solution: " + solution + " calculated in " + deltaTime + " milliseconds.");
			} else {
				System.out.println("Incorrect answer: " + solution);
			}
		} else {
			System.out.println("Solution not found");
		}
	}
	
}
