import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(); 
		int t = in.nextInt();
		
		boolean[] sosu = new boolean[1000001];
        sosu[0] = sosu[1] = true;
        for (int i = 2; i * i <= 1000000; i++) {
            if (!sosu[i]) {
                for (int j = i + i; j <= 1000000; j += i) {
                    sosu[j] = true;
                }
            }
        }
		
		for(int i=0;i<t;i++) {
			int n = in.nextInt();
			int cnt = 0;
			
			for(int j=0;j<=n/2;j++) {
				if(!sosu[j] && !sosu[n-j]) {
					cnt++;
				}
			}
			sb.append(cnt).append("\n");
		}
		
		
		
		System.out.println(sb);
	}
	
	
}

//시간초과