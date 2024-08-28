package Baekjoon2024;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ32193 {
	
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int a2 = 0; 
    	int b2 = 0;	
    	for(int i=0;i<n;i++) {
    		int a = in.nextInt();
    		int b = in.nextInt();
    		
    		
    		a2+=a;
    		b2+=b;
    		
    		System.out.println(a2-b2);
    	}
    }
   
    
}
