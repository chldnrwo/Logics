import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int L = in.nextInt();
		int[] arr = new int[L];
		for(int i=0;i<L;i++) {
			arr[i] = in.nextInt();
		}
		//Arrays.sort(arr);
		int n = in.nextInt();
		int a = 0;
		int b = 1001;
		
		for(int i=0;i<L-1;i++) {
			if(arr[i] < n) {
				if( arr[i] > a) {
					a = arr[i];
				}
			}else if(arr[i] > n) {
				if(arr[i] < b) {
					b = arr[i];
				}
			}else {	
				System.out.println(0);
				return;
			}
		}
		
		int cnt=0;
		for(int i=a+1;i<=n;i++) {
			for(int j=n;j<=b-1;j++) {
				if(i!=j) {
					cnt++;					
				}	
			}
		}
		
		System.out.println(cnt);
		
	}
	
}