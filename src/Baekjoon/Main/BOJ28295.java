package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ28295 {

    public static void main(String[] args) throws IOException {
    	Scanner in = new Scanner(System.in);
    	
    	int n = 0;
    	for(int i=0;i<10;i++) {
    		int a = in.nextInt();
    		if(a == 1) {
    			n+=90;
    		}else if(a == 2) {
    			n+=180;
    		}else if(a == 3) {
    			n -=90;
    		}
    	}
    	n %= 360;
    	
    	if(n==0) {
    		System.out.println("N");
    	}else if(n==90 || n==-270) {
    		System.out.println("E");
    	}else if(n==180 || n==-180) {
    		System.out.println("S");
    	}else if(n==270 || n==-90) {
    		System.out.println("W");
    	}
    }
    
}
