package Baekjoon.Main;
import java.util.*;

public class BOJ30224{
	
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		int n = Integer.parseInt(s);
				
		boolean ch = false;
		boolean ch2 = false;
		
		
		for(int i=0;i<s.length();i++) {
			String s1 = s.substring(i,i+1);
			if(s1.equals("7")) {
				ch = true;
				break;
			}
		}
		
		if(n%7!=0) {
			ch2 = false;
		}else {
			ch2 = true;
		}
		
		
		if(!ch && !ch2) {
			System.out.println(0);
		}else if(!ch && ch2) {
			System.out.println(1);
		}else if(ch && !ch2) {
			System.out.println(2);
		}else if(ch && ch2) {
			System.out.println(3);
		}
	}
	
}

