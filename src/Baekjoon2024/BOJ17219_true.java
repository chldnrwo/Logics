package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ17219_true {
	
    public static void main(String[] args) throws Exception {
        //Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Map<String, String> map = new HashMap<>();
        String[] arr = new String[n];
        String[] pas = new String[n];
        for(int i=0;i<n;i++) {
        	st = new StringTokenizer(br.readLine());
        	String a = st.nextToken();
        	String b = st.nextToken();
        	map.put(a, b);
        }
        
        
        for(int i=0;i<m;i++) {
        	String s = br.readLine();
        	
        		if(map.containsKey(s)) {
        			sb.append(map.get(s)).append("\n");
        			
        		}
        	
        }
        System.out.println(sb);
        
    }
   
  
} 
 