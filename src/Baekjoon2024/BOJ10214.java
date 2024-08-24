package Baekjoon2024;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ10214 {
	
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	
    	
    	
    	for(int i=0;i<n;i++) {
    		int yon = 0;
    		int ko = 0;
    		for(int j=0;j<9;j++) {
    			int y = in.nextInt();
    			int k = in.nextInt();
    			
    			yon+=y;
    			ko+=k;
        	}
    		
    		if(yon>ko) {
    			System.out.println("Yonsei");
    		}else if(ko<yon) {
    			System.out.println("Korea");
    		}else {
    			System.out.println("Draw");
    		}
    	}
    }
   
    
}
