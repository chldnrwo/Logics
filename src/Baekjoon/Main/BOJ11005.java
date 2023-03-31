package Baekjoon.Main;
import java.util.Scanner;

class BOJ11005{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int B = in.nextInt();
		
		String s = "";
		while(N!=0) {
			int a = N%B;
			N /= B;
			
			String s1;
			if(a>9) {
				char b = (char) (a+55);
				s1 = String.valueOf(b);
			}else {
				s1 = Integer.toString(a);
			}
			s = s1+s;
		}
		System.out.println(s);
	}
}