package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ2530{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int time = in.nextInt();
		int minute = in.nextInt();
		int second = in.nextInt();
		
		int sum = time * 3600 + minute * 60 + second;
		int num = in.nextInt();
		sum += num;
				
		time = (sum / 3600) % 24;
		sum%=3600;
		minute = (sum / 60) % 60;
		sum%=60;
		second = sum;
		
		System.out.println(time+" "+minute+" "+second);
	}	
}