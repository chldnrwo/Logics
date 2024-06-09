package Baekjoon.Main;
import java.util.*;

public class BOJ29722{

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		int n = in.nextInt();
		
		int year = Integer.parseInt(s.substring(0,4));
		int month = Integer.parseInt(s.substring(5,7));
		int day = Integer.parseInt(s.substring(8));
		
		day += n;
        
        // Adjust month and day based on their boundaries
        while (day > 30) {
            month++;
            day -= 30;
            if (month > 12) {
                year++;
                month = 1;
            }
        }

        System.out.printf("%04d-%02d-%02d", year, month, day);
	}
	
}

