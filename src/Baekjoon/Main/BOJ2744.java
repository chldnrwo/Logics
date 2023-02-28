package Baekjoon.Main;
import java.util.Scanner;

public class BOJ2744 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String str = in.next();
		char[] arr = new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			int a = str.charAt(i);
			if(65<=a && a<=90) {
				a+=32;
			}else {
				a-=32;
			}
			arr[i] = (char)a;
		}
		
		for(int i=0;i<str.length();i++) {
			System.out.print(arr[i]);
		}
	}
}
