import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       int n = in.nextInt();
       int[] arr = new int[n];
       
       for(int i = 0; i < n; i++) {
           arr[i] = in.nextInt();
       }
       

       int max = 0;
       int a = 0;
       int b = 0;
       
       Deque<Integer> q = new LinkedList<>();
       q.offer(arr[b]);
       
       while(true) {
    	   if(b==arr.length-1) {
    		   break;
    	   }
    	   
    	   b++;
 		   q.offer(arr[b]);
 		  
    	   if(q.size()>2) {
    		  int tmp = q.peekFirst();
    		  while(true) {
    			  a++;
    			  if(arr[a] != tmp) {
    				  break;
    			  }
    		  }
    	   }
    	   
    	   max = Math.max(max, b-a);
       }
       System.out.println(max);

    }
}