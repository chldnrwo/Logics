import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		int m = in.nextInt();
		int k = in.nextInt();
		
		if(m%k==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		
		
	}
}