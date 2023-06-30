package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ1406_timeout {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    	String s = in.next();
       
        int n = in.nextInt();
        int index = s.length();
        for(int i=0;i<n;i++) {
        	String p = in.next();
        	if(p.equals("L") && index !=0) {
        		index--;
        	} else if(p.equals("D") && index !=s.length()) {
        		index++;
        	} else if(p.equals("B") && index !=0) {
        		s = s.substring(0,index-1) + s.substring(index);
        		index--;
        	} else if(p.equals("P")) {
        		String s3 = in.next();
        		s = s.substring(0,index) + s3 + s.substring(index);
        		index++;
        	}
        }
        System.out.println(s);
    }
}
