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

public class BOJ2338 {

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);
    	
    	String a = in.next();
    	String b = in.next();
    	
    	BigInteger ba = new BigInteger(a); 
    	BigInteger bb = new BigInteger(b);
    	
    	System.out.println(ba.add(bb));
    	System.out.println(ba.subtract(bb));
    	System.out.println(ba.multiply(bb));
    	
    }
}