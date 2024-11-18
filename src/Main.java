import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	if(n<=100000 && (n%2024==0)) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    } 
   
    
}
