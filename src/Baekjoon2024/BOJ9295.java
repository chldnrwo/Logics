package Baekjoon2024;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ9295 {
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	
    	int n = in.nextInt();
    	
    	for(int i=0;i<n;i++) {
    		int a = in.nextInt();
    		int b = in.nextInt();
    		
    		System.out.println("Case "+(i+1)+": "+(a+b));
    	}
    }

   
}