package Checking;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Checker {
	
	private static BufferedReader br;
	private static FileReader fr;
	private static File solutions;
	private static String[] answers;
	
	public static void init() {
		
		solutions = new File("src/Checking/Solutions.txt");
		try {
			fr = new FileReader(solutions);
		} catch (FileNotFoundException e) {
			System.err.println("Solutions file not found.");
		}
		
		br = new BufferedReader(fr);

		String[] raw = new String[660];
		for(int i = 0; i < 664; i ++) {
			try {
				if(i < 4) {
					br.readLine();
				} else {
					raw[i-4] = br.readLine();
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		answers = new String[660];
		
		for(int i = 0; i < raw.length; i ++) {
			answers[i] = raw[i].split(" ")[1];
		}
	}
	
	public static boolean isCorrect(int problem, String answer) {
		return answer.equals(answers[problem-1]);
	}
}
