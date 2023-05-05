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

class BOJ1308{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int start_year = in.nextInt();
		int start_month = in.nextInt();
		int start_day = in.nextInt();
		int end_year = in.nextInt();
		int end_month = in.nextInt();
		int end_day = in.nextInt();
		
		LocalDate a = LocalDate.of(start_year, start_month, start_day);
		LocalDate b = LocalDate.of(end_year, end_month, end_day);
		
		long c = ChronoUnit.DAYS.between(a, b);
		long d = ChronoUnit.YEARS.between(a, b);
		
		if(d>=1000) {
			System.out.println("gg");
		}else {
			System.out.println("D-"+c);
		}
		
		
	}
	
}
/*
1000년 이상 지속될 경우 gg
윤년만 366일
 */