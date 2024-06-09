package Baekjoon.Main;

import java.util.Scanner;

public class BOJ2440 {
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
