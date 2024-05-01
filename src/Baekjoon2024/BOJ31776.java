package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31776 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
       int n = in.nextInt();
       int cnt = 0;
       for(int i=0;i<n;i++) {
    	   int a = in.nextInt();
    	   int b = in.nextInt();
    	   int c = in.nextInt();
    	   
    	   if(a==-1) {
    		   continue;
    	   }
    	   if(b==-1 && c!=-1) {
    		   continue;
    	   }
    	   
    	   List<Integer> list = new ArrayList<>();
    	   if(a != -1) {
    		   list.add(a);
    	   }
    	   if(b != -1) {
    		   list.add(b);
    	   }
    	   if(c != -1) {
    		   list.add(c);
    	   }
    	   
    	   if(list.size() == 0) {
    		   continue;
    	   }
    	   
    	   boolean check = true;
    	   
    	   for(int j=0;j<list.size()-1;j++) {
    		   if(list.get(j)>list.get(j+1)) {
    			   check = false;
    		   }
    	   }
    	   
    	   if(check) {
    		   cnt++;
    	   }
    	   
    	 
       }
       System.out.println(cnt);
    }
} 
