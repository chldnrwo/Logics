package Baekjoon.Main;
import java.math.BigInteger;
import java.util.*;

public class BOJ4999{
	static Integer[] arr;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		String s1 = in.next();
		
		if(s.length() < s1.length()) {
			System.out.println("no");
		}else {
			System.out.println("go");
		}
	}
	
}

