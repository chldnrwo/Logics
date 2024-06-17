import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);

       int n = in.nextInt();
       
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<n-1;i++) {
    	   if(i%2==0) {
    		   sb.append(1+" ");   
    	   }else {
    		   sb.append(2+" ");   
    	   } 
       }
       if(n%2==0) {
    	   sb.append(2+" ");   
       }else {
    	   sb.append(3+" ");   
       }
       
       
       System.out.println(sb);
    }
}

/*
 * 
 * 1212
 * 12123
 * 121212
 * 1212123
 */