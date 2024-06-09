package Baekjoon.Main;

import java.util.*;

public class BOJ30455{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
	// duck        goose
		//2 duck
		//3 goose
		//4 duck
		//5 goose 
		if(n%2==0) {
			System.out.println("Duck");
		}else {
			System.out.println("Goose");
		}
	}
	
}

