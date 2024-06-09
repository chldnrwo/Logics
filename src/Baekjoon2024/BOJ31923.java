package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31923 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       int n = in.nextInt();
       int p = in.nextInt();
       int q = in.nextInt();
       
       int[] arr1 = new int[n];
       int[] arr2 = new int[n];
       
       for(int i=0;i<n;i++) {
    	   arr1[i] = in.nextInt();
       }
       for(int i=0;i<n;i++) {
    	   arr2[i] = in.nextInt();
       }
       StringBuilder sb = new StringBuilder();
       
       for(int i=0;i<n;i++) {
    	   int cnt = 0;
    	
    	   while(true) {
    		   
    		   
    		   if(arr1[i] == arr2[i]) {
        		   sb.append(cnt).append(" ");
        		   break;
        	   }
    		   if(cnt>10000) {
    			   
    			   System.out.println("NO");
    			   System.exit(0);
    		   }
    		   cnt++;
    		   arr1[i]=arr1[i] + p;
    		   arr2[i]=arr2[i] + q;
    	   }
       }
       System.out.println("YES");
       System.out.println(sb);
    }
} 