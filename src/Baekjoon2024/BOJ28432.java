package Baekjoon2024;
import java.util.*;
import java.io.*;
 

 
class BOJ28432 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
       
        List<String> list = new ArrayList<>();
        int cnt = 0;
        for(int i=0;i<n;i++) {
        	String s = in.next();
        	list.add(s);
        	if(s.equals("?")) {
        		cnt = i;
        	}
        }
        int m = in.nextInt();
        List<String> list2 = new ArrayList<>();
        for(int i=0;i<m;i++) {
        	String s = in.next();
        	if(!list.contains(s)) {
        		list2.add(s);
        	}
        }
        
        int idx = -1;
        if(list.size()==1) {
        	System.out.println(list2.get(0));
        	System.exit(0);
        }
        else if(list.get(0).equals("?")) {
        	for(int i=0;i<list2.size();i++) {
        		if(list2.get(i).charAt(list2.get(i).length()-1) == list.get(1).charAt(0)) {
        			idx = i;
        		}
        	}
        }else if(list.get(list.size()-1).equals("?")){
        	for(int i=0;i<list2.size();i++) {
        		if(list2.get(i).charAt(0) == list.get(list.size()-2).charAt(list.get(list.size()-2).length()-1)) {
        			idx = i;
        		}
        	}
        }else {
        	char a = list.get(cnt-1).charAt(list.get(cnt-1).length()-1);
        	char b = list.get(cnt+1).charAt(0);
        	for(int i=0;i<list2.size();i++) {
        		String s = list2.get(i);
        		if(s.charAt(0) == a 
        				&& s.charAt(s.length()-1) == b) {
        			idx = i;
        		}
        		
        	}
        	
        }
        
        
        System.out.println(list2.get(idx));
    }
}