package Baekjoon.Main;
import java.util.Scanner;

class BOJ1159{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] arr = new int[26];
		for(int i=0;i<n;i++) {
			String s = in.next();
			
			int a = s.charAt(0) - 97;
			
			arr[a]++;
		}
		
		String s = "";
		for(int i=0;i<26;i++) {
			
			if(arr[i]>=5) {
				char s1 = (char) (i + 97);
				s+=s1;
			}
		}
		
		if(s.equals("")) {
			System.out.println("PREDAJA");
		}else {			
			System.out.println(s);
		}
	}
}