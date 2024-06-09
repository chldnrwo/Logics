package Baekjoon.Main;
import java.util.*;
 
public class BOJ16922{
 
    static int list[] = { 1, 5, 10, 50 };
    static int arr[];
    static int ans;
    static boolean visit[];
    static StringBuilder sb = new StringBuilder();
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N];
        ans = 0;
        visit = new boolean[1001];
        sc.close();
 
        dfs(N, 0, 0);
        sb.append(ans);
        System.out.println(sb);
    }
 
    private static void dfs(int N, int index, int sum) {
        if(N==0) {
            if(visit[sum]==false) {
                ans++;
                visit[sum]=true;
            }
            return;
        }
        
        
        for (int i = index; i < 4; i++) {
            dfs(N-1, i, sum + list[i]);
        }
    }
}