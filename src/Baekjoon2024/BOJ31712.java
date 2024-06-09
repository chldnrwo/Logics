package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31712 {
	
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        
        int a3 = in.nextInt();
        int b3 = in.nextInt();
        
        int tot = in.nextInt();
        
        
        int c1 = a1;
        int c2 = a2;
        int c3 = a3;
        int cnt=0;
        while(true) {
        	if(c1 == a1) {
        		tot-=b1;
        	}
        	c1--;
        	if(c2 == a2) {
        		tot-=b2;
        	}
        	c2--;
        	if(c3 == a3) {
        		tot-=b3;
        	}
        	c3--;
        	
        	if(c1 == 0) {
        		c1 = a1;
        	}
        	if(c2 == 0) {
        		c2 = a2;
        	}
        	if(c3 == 0) {
        		c3 = a3;
        	}
        	
        	if(tot<=0) {
        		System.out.println(cnt);
        		break;
        	}
        	cnt++;
        }
    }
    
  
} 
 