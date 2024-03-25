package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ17219 {
	
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        String[] arr = new String[n];
        String[] pas = new String[n];
        for(int i=0;i<n;i++) {
        	arr[i] = in.next();
        	pas[i] = in.next();
        }
        
        
        for(int i=0;i<m;i++) {
        	String s = in.next();
        	for(int j=0;j<n;j++) {
        		if(arr[j].equals(s)) {
        			System.out.println(pas[j]);
        		}
        	}
        }
        
    }
   
  
} 
 