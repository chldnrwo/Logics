package Baekjoon2024;
import java.util.*;
import java.io.*;

class BOJ16466 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       int n = in.nextInt();
       int[] arr = new int[n];
       
       for(int i = 0; i < n; i++) {
           arr[i] = in.nextInt();
       }
       
       Arrays.sort(arr);
       
       // Check if the smallest ticket number is not 1
       if (arr[0] != 1) {
           System.out.println(1);
           return;
       }
       
       // Find the smallest missing number
       for (int i = 0; i < n - 1; i++) {
           if (arr[i + 1] - arr[i] != 1) {
               System.out.println(arr[i] + 1);
               return;
           }
       }
       
       // If all numbers are continuous, the next number after the largest one is the answer
       System.out.println(arr[n - 1] + 1);
    }
}