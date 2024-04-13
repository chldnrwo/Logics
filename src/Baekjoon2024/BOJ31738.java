package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31738 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        long a = in.nextLong();
        long b = in.nextLong();
        
        if(a>=b) {
        	System.out.println(0);
        	System.exit(0);
        }
        long result = 1;
        for (long i = 2; i <= a; i++) {
            result = (result * i) % b;
            if (result == 0) {
                break;
            }
        }
        System.out.println(result);
        
    }
    
  
  
} 
 /*
  5 7 5
  20 7 6
  18 7 4
  8 7 1
  
  
  
  
  */