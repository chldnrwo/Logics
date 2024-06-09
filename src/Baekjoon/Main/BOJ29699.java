package Baekjoon.Main;
import java.util.*;

public class BOJ29699{

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		String s = "WelcomeToSMUPC";
		
		int n = in.nextInt()-1;
		n %= s.length();
		System.out.println(s.charAt(n));
		
		// 1 -> 0
		// 13 -> 12
		// 14 -> 13
		// 15 -> 0
		
	}
	
}
