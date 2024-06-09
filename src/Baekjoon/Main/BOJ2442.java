package Baekjoon.Main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class BOJ2442{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		
		for(int i=0;i<r;i++){
			for(int j=0;j<(r-i-1);j++){
				System.out.print(" ");	
			}
			for(int k=0;k<(2*i+1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
