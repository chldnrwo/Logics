package Baekjoon.Main;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class BOJ1309_탑다운dp{
	static Integer[][] arr;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		if(n==1) {
			System.out.println(3);
			System.exit(0);
		}
		arr = new Integer[n+1][3];
		arr[1][0] = 1;
		arr[1][1] = 1;
		arr[1][2] = 1;
		
		int a = (dp1(n-1)*2+dp2(n-1)*2+dp3(n-1)*3)%9901;
		System.out.println(a);
	}
	public static Integer dp1(int n) {
		if(arr[n][0]==null) {
			arr[n][0] = dp1(n-1)+dp3(n-1);
		}
		
		return arr[n][0]%9901;
	}
	public static Integer dp2(int n) {
		if(arr[n][1]==null) {
			arr[n][1] = dp2(n-1)+dp3(n-1);
		}
		
		return arr[n][1]%9901;
	}
	public static Integer dp3(int n) {
		if(arr[n][2]==null) {
			arr[n][2] = dp1(n-1)+dp2(n-1)+dp3(n-1);
		}
		
		return arr[n][2]%9901;
	}
	
}
/*
최소 0
최대 n

n이 4일 경우
0 1
1 
2
3
4 2

dp

1 1+1+1	3								3
2 1*2+1*2+1*3 7
3 2*2+2*2+3*3 17	
4 5*2+5*2+7*3 41
5 12*2 + 12*2 + 17*3
6 	
*/
