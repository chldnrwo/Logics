package Baekjoon2024;
import java.io.*;
import java.util.*;

public class BOJ31495 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		
		String[] arr = s.split("\"");
		
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if('"' == c) {
				cnt++;
			}
		}
		if(cnt==2) {
			if(s.charAt(0)=='"' && s.charAt(s.length()-1)=='"'
				&& s.length() > 2	) {
				System.out.println(arr[1]);
			}else {
				System.out.println("CE");
			}
		}
		else {
			System.out.println("CE");
		}
		
		
		
	}
}