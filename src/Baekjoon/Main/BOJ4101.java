package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ4101 {

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);
    	
    	
    	while(true) {
    		int a = in.nextInt();
        	int b = in.nextInt();
        	
        	if(a==0 && b==0) {
        		break;
        	}
        	
        	if(a>b) {
        		System.out.println("Yes");
        	}else {
        		System.out.println("No");
        	}
    	}
    }
}