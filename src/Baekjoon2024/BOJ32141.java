package Baekjoon2024;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ32141 {
	
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int h = in.nextInt();
    	int cnt = 0;
    	for(int i =0;i<n;i++) {

    		int a = in.nextInt();
    		
    		if(h<=0) {
    			continue;
    		}
    		h-=a;
    		cnt++;

    	}
    	
    	
    	if(h<=0) {
    		System.out.println(cnt);
    	}else {
    		System.out.println(-1);
    	}
    }
   
    
}
