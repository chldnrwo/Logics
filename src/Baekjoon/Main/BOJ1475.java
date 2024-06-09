package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class BOJ1475 {
    public static void main(String[] args) throws IOException {
        
    	Scanner in = new Scanner(System.in);
    	int[] arr = new int[10];
    	
    	String s = in.next();
    	int maxValue = 0;
    	int maxIndex = -1;
    	for(int i=0;i<s.length();i++) {
    		int a = s.charAt(i)-48;
    		arr[a]++;
    	}
    	double a = Math.round((arr[6]+arr[9]) / (double)2);  
    	arr[6] = (int)a;
    	arr[9] = (int)a;
    	
    	Arrays.sort(arr);
    	System.out.println(arr[9]);
    	
    }
}

