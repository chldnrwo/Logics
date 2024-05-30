package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31907 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       int n = in.nextInt();
       
       char[][] arr = new char[3][4];
       String s = "G...";
       String s1 = ".I.T";
       String s2 = "..S.";
	   for(int j=0;j<4;j++) {
		   arr[0][j] = s.charAt(j);
	   }
	   for(int j=0;j<4;j++) {
		   arr[1][j] = s1.charAt(j);
	   }
	   for(int j=0;j<4;j++) {
		   arr[2][j] = s2.charAt(j);
	   }
	   
	   StringBuilder sb = new StringBuilder();
	   String res = "";
       for(int i=0;i<4;i++) {
    	   for(int j=0;j<n;j++) {
    		   res+=arr[0][i];
    	   }
       }
       
       for(int i=0;i<n;i++) {
    	   sb.append(res).append("\n");
       }
       
       res = "";
       for(int i=0;i<4;i++) {
    	   for(int j=0;j<n;j++) {
    		   res+=arr[1][i];
    	   }
       }
       
       for(int i=0;i<n;i++) {
    	   sb.append(res).append("\n");
       }
       
       res = "";
       for(int i=0;i<4;i++) {
    	   for(int j=0;j<n;j++) {
    		   res+=arr[2][i];
    	   }
       }
       
       for(int i=0;i<n;i++) {
    	   sb.append(res).append("\n");
       }
       System.out.println(sb);
    }
} 