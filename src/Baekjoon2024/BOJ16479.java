package Baekjoon2024;
import java.util.*;
import java.io.*;

class BOJ16479 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
       
       int k = in.nextInt();
       int d1 = in.nextInt();
       int d2 = in.nextInt();
       
       double a = (d1 - d2)/(double)2;
       double res = k*k - a*a;
       
       //System.out.println(res);   
       
       if(res % 1.0 == 0) {
    	   System.out.println((int)res);
       }else {
    	   System.out.println(res);   
       }
    }
}
