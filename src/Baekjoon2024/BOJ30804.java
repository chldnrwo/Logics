package Baekjoon2024;
import java.util.*;
import java.io.*;

class BOJ30804 {
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
       int[] nums = new int[10]; // Assuming numbers are between 0-9
       int kind = 0;

       while (b < n) {
           if (nums[arr[b]] == 0) {
               kind++;
           }
           nums[arr[b]]++;
           b++;

           while (kind > 2) {
               nums[arr[a]]--;
               if (nums[arr[a]] == 0) {
                   kind--;
               }
               a++;
           }

           max = Math.max(max, b - a);
       }
       
       System.out.println(max);
    }
}