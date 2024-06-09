package Baekjoon.Main;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ1339 {
    public static void main(String[] args) {
        
        //testcase 및 문자열 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] arr = new String[n];
        int [] alpha = new int[26];
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }


        for(int i=0; i<n; i++){
            int temp = (int)Math.pow(10,arr[i].length()-1);
            for(int j=0; j<arr[i].length(); j++){
                alpha[(int)arr[i].charAt(j)-65]+=temp;
                temp /=10;
            }
        }

        Arrays.sort(alpha);
        int index = 9;
        int sum =0;
        for(int i=alpha.length-1; i>=0; i--){
            if(alpha[i] == 0){
                break;
            }
            sum+= alpha[i]*index;
            index--;
        }
        System.out.println(sum);
    }
}