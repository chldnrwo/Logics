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

public class BOJ28248 {

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);
    	int p = in.nextInt();
    	int c = in.nextInt();
    	
    	int sum = 0;
    	sum+=p*50;
    	sum+=c*(-10);
    	if(p>c) {
    		sum+=500;
    	}
    	System.out.println(sum);
    }
}