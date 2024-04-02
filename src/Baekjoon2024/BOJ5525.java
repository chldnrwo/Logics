package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ5525 {
	
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        char[] s = in.next().toCharArray();
        
        int cnt = 0;
        int res = 0;
        for(int i=1;i<m-1;i++) {
        	if(s[i-1]=='I' && s[i]=='O' && s[i+1]=='I') {
        		cnt++;
        		if(cnt == n) {
        			cnt--;
        			res++;
        		}
        		i++;
        		
        	}else {
        		cnt = 0;
        	}
        	
        	
        	
        }
        System.out.println(res);
    }
    
  
} 
 