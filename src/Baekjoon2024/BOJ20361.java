package Baekjoon2024;
import java.io.*;
import java.util.*;

public class BOJ20361 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int x = in.nextInt();
		int k = in.nextInt();
		boolean[] arr = new boolean[n+1];
		arr[x] = true;
				
		for(int i=0;i<k;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			if(a==x) {
				x=b;
			}else if(b==x) {
				x=a;
			}
			
		}
		
		System.out.println(x);
		
	}
}