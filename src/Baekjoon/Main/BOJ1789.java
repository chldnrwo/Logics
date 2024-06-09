package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class BOJ1789 {
    public static void main(String[] args) throws IOException {
        
    	Scanner in = new Scanner(System.in);
    	
    	long n = in.nextLong();
    	
    	long m = (long)Math.sqrt(2*n);

    	while(true) {
    		long a = m * (m+1) / 2;
    		if(a<=n) {
    			System.out.println(m);
    			break;
    		}
    		m--;
    	}
    }
}

