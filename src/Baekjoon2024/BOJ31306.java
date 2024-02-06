package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ31306{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		
		int vowel = 0;
		int vowely = 0;
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == 'a' || c=='e' || c=='u' || c=='i' || c=='o' ) {
				vowel++;
			}else if(c=='y') {
				vowely++;
			}
		}
		
		System.out.println(vowel + " "+(vowel + vowely));
	}
}

