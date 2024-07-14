package Baekjoon2024;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ32025 {
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	
    	int a = in.nextInt();
    	int b = in.nextInt();
    	
    	int min = Math.min(a, b);
    	
    	
    	System.out.println(min*50);
    }

   
}