package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31669 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        boolean[][] arr = new boolean[n][m];
        for(int i=0;i<n;i++) {
        	String s = in.next();
        	for(int j=0;j<m;j++) {
            	if(s.charAt(j)=='O') {
            		arr[i][j] = true;
            	} 
            }
        }
        
        
        for(int i=0;i<m;i++) {
        	boolean check = true;
        	for(int j=0;j<n;j++) {
            	if(arr[j][i]) {
            		check = false;
            	}
            }
        	if(check) {
        		System.out.println(i+1);
        		System.exit(0);
        	}
        }
        System.out.println("ESCAPE FAILED");
    }
    
  
  
} 
 