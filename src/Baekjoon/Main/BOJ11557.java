package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ11557{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		for(int i=0;i<t;i++) {
			int n = in.nextInt();
			String maxU = "";
			int maxN = 0;
			for(int j=0;j<n;j++) {
				String uni = in.next();
				int num = in.nextInt();
				if(maxN<num) {
					maxN = num;
					maxU = uni;
				}
			}
			System.out.println(maxU);
		}
	}	
}
