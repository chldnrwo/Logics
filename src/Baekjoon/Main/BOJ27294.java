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

public class BOJ27294 {

    public static void main(String[] args) throws IOException {
    	Scanner in = new Scanner(System.in);
    	int time = in.nextInt();
    	int drink = in.nextInt();
    	
    	if(drink == 1) {
    		System.out.println(280);
    	}else if(12<=time && time<=16) {
    		System.out.println(320);
    	}else {
    		System.out.println(280);
    	}
    }
}