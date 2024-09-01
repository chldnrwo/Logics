package Baekjoon2024;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ32184 {
	
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	int a = in.nextInt();
    	int b = in.nextInt();
    	
    	if(a%2==0) {
    		a--;
    	}
    	
    	if(b%2==0) {
    		b--;
    	}
    	
    	System.out.println((b-a)/2+1);
    	
    }
   
    
}
