package Baekjoon2024;
import java.io.*;
import java.util.*;

public class BOJ10799 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		int cnt = 0;
		
		int token = 0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)=='('&&s.charAt(i+1)==')') {
				cnt+=token;
				i++;
			}else if(s.charAt(i)=='(') {
				token++;
			}else if(s.charAt(i)==')') {
				token--;
				cnt++;
			}
		}
		
		if(s.charAt(s.length()-2) == ')') {
			token--;
			cnt++;
		}
		
		
			
		
		System.out.println(cnt);
	}
	
}


