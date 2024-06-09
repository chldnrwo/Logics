package Baekjoon2024;
import java.util.*;
import java.io.*;
 

 
class BOJ31654 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        
        int k = in.nextInt();
        
        if(n+m == k) {
        	System.out.println("correct!");
        }else {
        	System.out.println("wrong!");
        }
        
    }
}