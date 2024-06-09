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

public class BOJ14697 {

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);
    	int a=in.nextInt();
    	int b=in.nextInt();
    	int c=in.nextInt();
    	int num=in.nextInt();
    		for(int i=0;i<101;i++) {
    			for(int j=0;j<101;j++) {
    				for(int k=0;k<101;k++) {
    	    			if(i*a+j*b+k*c == num) {
    	    				System.out.println(1);
    	    				System.exit(0);
    	    			}
    	    		}
        		}
    		}
    	System.out.println(0);
    	
    }
}