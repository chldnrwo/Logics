package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31713 {
	
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        for(int i=0;i<t;i++) {
        	int a = in.nextInt();
        	int b = in.nextInt();
        	
        	int cnt = 0;
        	while(true) {
        		if(3*a<=b && b<=4*a) {
            		System.out.println(cnt);
            		break;
            	}
        		if(4*a < b) {
        			a++;
        			cnt++;
        		}
        		if(3*a > b) {
        			b++;
        			cnt++;
        		}
        		
        	}
        
        }
         
    }
    
  
} 
 