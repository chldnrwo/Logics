package Baekjoon2024;
import java.util.*;
import java.io.*;

class BOj25628 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);

       int a = in.nextInt();
       
       int b = in.nextInt();
       
       
       a /= 2;
       
       
       System.out.println(Math.min(a, b));
    }
}