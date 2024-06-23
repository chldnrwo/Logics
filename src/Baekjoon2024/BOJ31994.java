package Baekjoon2024;
import java.util.*;
import java.io.*;

class BOJ31994 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
       
       int max = 0;
       String target = "";
       for(int i =0;i<7;i++) {
    	   String s = in.next();
    	   int a = in.nextInt();
    	   
    	   if(max < a) {
    		   max = a;
    		   target = s;
    	   }
    	   
       }
       System.out.println(target);
    }
}

/*
 * 
 * 1212
 * 12123
 * 121212
 * 1212123
 */