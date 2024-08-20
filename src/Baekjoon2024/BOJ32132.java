package Baekjoon2024;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ32132 {
	
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	
    	String s = in.next();
    	
   
    	
    	for(int i=0;i<n-2;i++) {
    		String s2 = s.substring(i,i+3);
    		if(s2.equals("PS4") || s2.equals("PS5")) {
    			s = s.substring(0,i) + "PS" + s.substring(i+3);
    			i--;
    			n--;
    		}
    	}
    	System.out.println(s);
    }
   
    
}
