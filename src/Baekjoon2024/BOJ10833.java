package Baekjoon2024;
import java.io.*;
import java.util.*;

public class BOJ10833 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int cnt = 0;
		for(int i=0;i<n;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			cnt+=b%a;
		}
		System.out.println(cnt);
	}
	
}