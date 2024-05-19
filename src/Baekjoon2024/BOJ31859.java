package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31859 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       int n = in.nextInt();
       String s = in.next();
       
       String res = "";
       
       boolean[] arr = new boolean[26];
       int cnt=0;
       for(int i=0;i<s.length();i++) {
    	   char c = s.charAt(i);
    	   
    	   if(!arr[c-97]) {
    		   arr[c-97] = true;
    		   res+=s.substring(i,i+1);
    	   }else {
    		   cnt++;
    	   }   
       }
       res+=String.valueOf(cnt+4);
       res = String.valueOf(n+1906) + res;
       
       StringBuilder sb = new StringBuilder(res);
       sb.reverse();
       String s2 = sb.toString();
       System.out.println("smupc_"+s2);
    }
} 
