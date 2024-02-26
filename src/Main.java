import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] arr = new int[n];
		
		
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
			
		}
		for(int i=0;i<n;i++) {
			if(arr[i]==0){
				if(arr.length>1) {
					System.out.println("YES");
					System.out.println(arr[i+1]*10);
					System.exit(0);
				}else {
					System.out.println("YES");
					System.out.println(0);
					System.exit(0);
				}
			}
			if(arr[i]%2==0 || arr[i]==9) {
				System.out.println("YES");
				System.out.println(arr[i]);
				System.exit(0);
			}else if(arr[i]==3 || arr[i]==7 || arr[i]==5) {
				System.out.println("YES");
				System.out.println(arr[i]*11);
				System.exit(0);
			}
		}
		
		System.out.println("NO");
		System.exit(0);
		
		
	}
}