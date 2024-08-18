package Baekjoon2024;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ10163 {
	
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	
    	int[][] arr = new int[1001][1001];
    	
    	for(int i=1;i<n+1;i++) {
    		int s1 = in.nextInt();
    		int s2 = in.nextInt();
    		int e1 = in.nextInt();
    		int e2 = in.nextInt();
    		
    		for(int j=s1;j<s1+e1;j++) {
    			for(int k=s2;k<s2+e2;k++) {
        			arr[j][k] = i;
        		}
    		}
    	}
    	
    	for(int i=1;i<n+1;i++) {
    		int cnt = 0;
    		for(int j=0;j<1001;j++) {
    			for(int k=0;k<1001;k++) {
        			if(arr[j][k]==i) {
        				cnt++;
        			}
        		}
    		}
    		System.out.println(cnt);
    	}
    	
    }
   
    
}
