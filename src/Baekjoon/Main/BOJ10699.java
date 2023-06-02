package Baekjoon.Main;
//import java.util.*;
// 
//public class Main{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		int n = in.nextInt();
//		
//		List<String> list = new ArrayList<String>(Arrays.asList("@","[","!",";","^","0","7"));
//
//		
//		for(int i=0;i<n;i++) {
//			String s = in.next();
//			int len = s.length();
//			int n1 = 0;
//			int n2 = 0;
//			int n3 = 0;
//			for(int j=0;j<len;j++) {
//				String c = s.substring(j,j+1);
//				if(list.contains(c)) {
//					n1++;
//				}
//			}
//			for(int j=0;j<len-1;j++) {
//				String c = s.substring(j,j+2);
//				if(c.equals("\\'")) {
//					n2++;
//				}
//			}
//			for(int j=0;j<len-2;j++) {
//				String c = s.substring(j,j+3);
//				if(c.equals("\\\\'")) {
//					n3++;
//				}
//			}
//			double reallen = len - n2 - n3*2;
//			if(n1+n2+n3 >= reallen/2) {
//				System.out.println("I don't understand");
//				continue;
//			}
//			
//	
//			s = s.replace("@", "a");
//			s = s.replace("[", "c");
//			s = s.replace("!", "i");
//			s = s.replace(";", "j");
//			s = s.replace("^", "n");
//			s = s.replace("0", "o");
//			s = s.replace("7", "t");
//			s = s.replace("\\'", "v");
//			s = s.replace("\\\\'", "w");
//			System.out.println(s);
//		}
//	}
//}

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class BOJ10699 {
    public static void main(String[] args) {
        
    	Date date = new Date();
		DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
		df.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
		System.out.println(df.format(date));
    }
}

