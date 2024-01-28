package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ30087{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i=0;i<n;i++) {
			String s = in.next();
			if(s.equals("Algorithm")) {
				System.out.println(204);
			}else if(s.equals("DataAnalysis")) {
				System.out.println(207);
			}else if(s.equals("ArtificialIntelligence")) {
				System.out.println(302);
			}else if(s.equals("CyberSecurity")) {
				System.out.println("B101");
			}else if(s.equals("Network")) {
				System.out.println(303);
			}else if(s.equals("Startup")) {
				System.out.println(501);
			}else if(s.equals("TestStrategy")) {
				System.out.println(105);
			}
		}
	}
}

