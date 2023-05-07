package Baekjoon.Main;
import java.util.Scanner;

public class BOJ1312_나눗셈원리 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        
        int r = a;
        int res = 0;
        while(n!=0) {
        	r = ((r%b)*10);
        	res = r / b;
        	
        	n--;
        }
        
        System.out.println(res);
    }
}
