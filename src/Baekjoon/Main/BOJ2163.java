package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class BOJ2163 {
    public static void main(String[] args) throws IOException {
        
    	Scanner in = new Scanner(System.in);
    	
    	int n = in.nextInt();
    	int m = in.nextInt();
    	
    	int sum = n * m -1;
    	
    	System.out.println(sum);
    }
}

