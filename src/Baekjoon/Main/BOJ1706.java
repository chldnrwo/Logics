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

class BOJ1706{
	
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int c = in.nextInt();
		
		String[][] arr = new String[r][c];
		for(int i=0;i<r;i++) {
			String s = in.next();
			for(int j=0;j<c;j++) {
				arr[i][j] = s.substring(j,j+1);
			}
		}
		List<String> list = new ArrayList<>();
		for(int i=0;i<r;i++) {
			String s = "";
			for(int j=0;j<c;j++) {
				if(!arr[i][j].equals("#")) {
					s = s+arr[i][j];
				}else{
					if(s.length()>=2) {
						list.add(s);
					}
					s = "";
				}
			}
			if(s.length()>=2) {
				list.add(s);
			}
		}
		for(int i=0;i<c;i++) {
			String s = "";
			for(int j=0;j<r;j++) {
				if(!arr[j][i].equals("#")) {
					s = s+arr[j][i];
				}else{
					if(s.length()>=2) {
						list.add(s);
					}
					s = "";
				}
			}
			if(s.length()>=2) {
				list.add(s);
			}
		}
		Collections.sort(list);
		System.out.println(list.get(0));
		
	}
	
}
