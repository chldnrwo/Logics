package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31881 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       int n = in.nextInt();
       int q = in.nextInt();
       
       int cnt = n;
       boolean[] arr = new boolean[n+1];
       
       for(int i=0;i<q;i++) {
    	   int a = in.nextInt();
    	   if(a==1) {
    		   int x = in.nextInt();
    		   
    		   if(!arr[x]) {
    			   arr[x] = true;
    			   cnt--;
    		   }
    		   
    	   }else if(a==2) {
    		   int x = in.nextInt();
    		   if(arr[x]) {
    			   arr[x] = false;
    			   cnt++;
    		   }
    	   }else if(a==3) {
    		   System.out.println(cnt);
    	   }
       }
    }
} 