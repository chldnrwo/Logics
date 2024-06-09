package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOj25377 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
        	int a = in.nextInt();
        	int b = in.nextInt();
        	
        	if(a>b) {
        		continue;
        	}
        	
        	min = Math.min(b, min);
        	
        }
        
        
        if(min == Integer.MAX_VALUE) {
        	System.out.println(-1);
        }else {
        	System.out.println(min);
        }
    }
    
  
  
} 
 