package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31844 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       String s = in.next();
       int rob = 0;
       int goal = 0;
       int box = 0;
       for(int i=0;i<s.length();i++) {
    	   if(s.charAt(i) == '@') {
    		   rob = i;
    	   }else if(s.charAt(i) == '#') {
    		   box = i;
    	   }else if(s.charAt(i) == '!') {
    		   goal = i;
    	   }
       }
       
       if( (rob < box && box < goal) ||
    		   (rob > box && box > goal) ) {
    	   System.out.println(Math.abs(goal - rob)-1);
       }else {
    	   System.out.println(-1);
       }
    }
} 
