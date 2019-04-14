package Solutions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class p042 {
	
	public static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	
	public static String getSolution() {
		File text = new File("src/Assets/p042_words.txt");
		FileReader fr = null;
		try {
			fr = new FileReader(text);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(fr);
		String[] words = null;
		try {
			words = br.readLine().split(",");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int[] triangleNum = new int[50];
		for(int i = 1; i <= 50; i ++) {
			triangleNum[i-1] = i*(i+1)/2; 
		}
		
		int triWords = 0;
		for(int i = 0; i < words.length; i ++) {
			int val = getValue(words[i]);
			for(int ii = 0; ii < triangleNum.length; ii ++) {
				if(val == triangleNum[ii]) {
					triWords ++;
					break;
				}
			}
		}
		
		return String.valueOf(triWords);
	}
	
	private static int getValue(String str) {
		str = str.toLowerCase();
		char[] c = str.toCharArray();
		
		int retVal = 0;
		for(int i = 0; i < c.length; i ++) {
			int val = 0;
			for(int ii = 0; ii < alphabet.length; ii ++) {
				if(c[i] == alphabet[ii]) val = ii+1;
			}
			
			retVal += val;
		}
		
		return retVal;
	}
}
