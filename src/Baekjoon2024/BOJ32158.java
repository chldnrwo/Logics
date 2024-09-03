package Baekjoon2024;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ32158 {
	
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	int num = in.nextInt();
    	String s = in.next();
    	
    	int p = 0;
    	int c = 0;
    	char[] arr = s.toCharArray();
    	for(int i=0;i<s.length();i++) {
    		char ch = s.charAt(i); 
    		if(ch=='P') {
    			p++;
    		}else if(ch == 'C') {
    			c++;
    		}
    		
    	}
    	
    	
    	int p2 = Math.min(p, c);
    	int c2 = Math.min(p, c);
    	for(int i=0;i<s.length();i++) {
    		char ch = s.charAt(i); 
    		if(ch=='P' && p2 != 0) {
    			arr[i] = 'C';
    			p2--;
    		}else if(ch == 'C' && c2 !=0) {
    			arr[i] = 'P';
    			c2--;
    		}
    		
    		
    		if(p2 == 0 && c2 == 0) {
    			break;
    		}
    	}
    	
    	System.out.println(arr);
    }
   
    
}
