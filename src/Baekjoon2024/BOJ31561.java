package Baekjoon2024;
import java.io.*;
import java.util.*;

public class BOJ31561 {
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		double res = 0;
		if(n<=30) {
			res = n/2;
		}else {
			res = 15 + (double)(n-30)*3/2;
		}
		System.out.println(res);
	}
}