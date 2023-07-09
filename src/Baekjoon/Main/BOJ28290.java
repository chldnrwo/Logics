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

public class BOJ28290 {

    public static void main(String[] args) throws IOException {
    	Scanner in = new Scanner(System.in);
    	String s = in.next();
    	
    	if(s.equals("fdsajkl;") || s.equals("jkl;fdsa")) {
    		System.out.println("in-out");
    	}else if(s.equals("asdf;lkj") || s.equals(";lkjasdf")) {
    		System.out.println("out-in");
    	}else if(s.equals("asdfjkl;")) {
    		System.out.println("stairs");
    	}else if(s.equals(";lkjfdsa")) {
    		System.out.println("reverse");
    	}else {
    		System.out.println("molu");
    	}
    }
}