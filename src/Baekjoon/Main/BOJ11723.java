package Baekjoon.Main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class BOJ11723 {
    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	Set<Integer> set = new HashSet<>();
    	
    	int n = in.nextInt();
    	for(int i=0;i<n;i++) {
    		String s = in.next();
    		
    		if(s.equals("add")) {
    			int n2 = in.nextInt();
    			if(!set.contains(n2)) {
    				set.add(n2);
    			}
    		}else if(s.equals("remove")) {
    			int n2 = in.nextInt();
    			if(set.contains(n2)) {
    				set.remove(n2);
    			}
    		}else if(s.equals("check")) {
    			int n2 = in.nextInt();
    			if(!set.contains(n2)) {
    				sb.append(0).append("\n");
    			}else {
    				sb.append(1).append("\n");
    			}
    		}else if(s.equals("toggle")) {
    			int n2 = in.nextInt();
    			if(set.contains(n2)) {
    				set.remove(Integer.valueOf(n2));
    			}else {
    				set.add(n2);
    			}
    		}else if(s.equals("all")) {
    			for(int j=1;j<=20;j++) {
    				set.add(j);
    			}
    		}else if(s.equals("empty")) {
    			set = new HashSet<>();
    		}
    	}
    	System.out.println(sb);
    }
}

