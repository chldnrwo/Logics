import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		int[][] arr = new int[N][M];
		
		for(int i=0;i<N;i++) {
			String s = in.next();
			for(int j=0;j<M;j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		int MaxL = Math.min(N, M)-1;
		
		int res=0;
		while(true) {
			
			for(int i=0;i<N-(MaxL);i++) {
				for(int j=0;j<M-(MaxL);j++) {
					if(arr[i][j]==arr[i][j+MaxL]
						&&arr[i][j]==arr[i+MaxL][j]
						&&arr[i][j]==arr[i+MaxL][j+MaxL]) {
						res = (MaxL+1) * (MaxL+1);
						System.out.println(res);
						System.exit(0);
					}
				}
			}
			MaxL--;
		}
		
//		for(int i=0;i<N;i++) {
//			for(int j=0;j<M;j++) {
//				System.out.print(arr[i][j]-48);
//				
//			}
//			System.out.println();
		
	}
}