package Baekjoon2024;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ1439 {
	
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	String s = in.next();
    	int cnt = 0;
    	for(int i=0;i<s.length()-1;i++) {
    		if(s.charAt(i)!=s.charAt(i+1)) {
    			cnt++;
    		}
    	}
    	
    	if(cnt%2==0) {
    		System.out.println(cnt/2);
    	}else {
    		System.out.println((cnt+1)/2);
    	}
    }
   
    
}
