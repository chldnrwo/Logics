package Baekjoon.Main;
//import java.util.*;
// 
//public class Main{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		int n = in.nextInt();
//		
//		List<String> list = new ArrayList<String>(Arrays.asList("@","[","!",";","^","0","7"));
//
//		
//		for(int i=0;i<n;i++) {
//			String s = in.next();
//			int len = s.length();
//			int n1 = 0;
//			int n2 = 0;
//			int n3 = 0;
//			for(int j=0;j<len;j++) {
//				String c = s.substring(j,j+1);
//				if(list.contains(c)) {
//					n1++;
//				}
//			}
//			for(int j=0;j<len-1;j++) {
//				String c = s.substring(j,j+2);
//				if(c.equals("\\'")) {
//					n2++;
//				}
//			}
//			for(int j=0;j<len-2;j++) {
//				String c = s.substring(j,j+3);
//				if(c.equals("\\\\'")) {
//					n3++;
//				}
//			}
//			double reallen = len - n2 - n3*2;
//			if(n1+n2+n3 >= reallen/2) {
//				System.out.println("I don't understand");
//				continue;
//			}
//			
//	
//			s = s.replace("@", "a");
//			s = s.replace("[", "c");
//			s = s.replace("!", "i");
//			s = s.replace(";", "j");
//			s = s.replace("^", "n");
//			s = s.replace("0", "o");
//			s = s.replace("7", "t");
//			s = s.replace("\\'", "v");
//			s = s.replace("\\\\'", "w");
//			System.out.println(s);
//		}
//	}
//}

import java.util.*;

public class BOJ28125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hm = new HashMap<>();
        hm.put("@", "a");
        hm.put("[", "c");
        hm.put("!", "i");
        hm.put(";", "j");
        hm.put("^", "n");
        hm.put("0", "o");
        hm.put("7", "t");
        hm.put("\\'", "v");
        hm.put("\\\\'", "w");

        int N = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<N; i++){
            String word = sc.nextLine();
            String result = "";
            int changeCount = 0;
            for(int j=0; j<word.length(); j++){
                if(j<word.length()-2 && word.charAt(j) == '\\' && word.charAt(j+1) == '\\' && word.charAt(j+2) == '\''){
                    result += "w";
                    j += 2;
                } else if(j<word.length()-1 && word.charAt(j) == '\\' && word.charAt(j+1) == '\''){
                    result += "v";
                    j++;
                } else {
                    String character = Character.toString(word.charAt(j));
                    if(hm.containsKey(character)){
                        result += hm.get(character);
                        changeCount++;
                    }else{
                        result += character;
                    }
                }
            }
            for (char c : result.toCharArray()) {
                if (c == 'v' || c == 'w') {
                    changeCount++;
                }
            }
            if(changeCount >= result.length()/(double)2){
                System.out.println("I don't understand");
            }else{
                System.out.println(result);
            }
        }
    }
}

