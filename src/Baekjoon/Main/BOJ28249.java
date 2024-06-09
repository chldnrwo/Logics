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

public class BOJ28249 {

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int sum = 0;
    	for(int i=0;i<n;i++) {
    		String s = in.next();
    		if(s.equals("Poblano")) {
    			sum+=1500;
    		}else if(s.equals("Mirasol")) {
    			sum+=6000;
    		}else if(s.equals("Serrano")) {
    			sum+=15500;
    		}else if(s.equals("Cayenne")) {
    			sum+=40000;
    		}else if(s.equals("Thai")) {
    			sum+=75000;
    		}else if(s.equals("Habanero")) {
    			sum+=125000;
    		}
    		
    	}
    	System.out.println(sum);
    }
}