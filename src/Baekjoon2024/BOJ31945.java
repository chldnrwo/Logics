package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31945 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       int n = in.nextInt();
       int[] arr;
       
       int[] ans1 = {0,1,2,3};
       int[] ans2 = {0,1,4,5};
       int[] ans3 = {4,5,6,7};
       int[] ans4 = {2,3,6,7};
       int[] ans5 = {0,2,4,6};
       int[] ans6 = {1,3,5,7};
       for(int i=0;i<n;i++) {
    	   // 0 1 2 3
    	   // 0 1 4 5
    	   // 4 5 6 7
    	   // 6 7 2 3
    	   // 0 2 4 6
    	   // 1 3 5 7
    	   arr= new int[4];
    	   for(int j=0;j<4;j++) {
    		   arr[j] = in.nextInt();
    	   }
    	   Arrays.sort(arr);
    	   //System.out.println(Arrays.toString(arr));
    	   
    	   if(Arrays.equals(arr, ans1) || Arrays.equals(arr, ans2) || 
    			   Arrays.equals(arr, ans3) || Arrays.equals(arr, ans4) ||
    			   Arrays.equals(arr, ans5) || Arrays.equals(arr, ans6)  ) {
    		   System.out.println("YES");
    	   }else {
    		   System.out.println("NO");
    	   }
       }
    }
} 