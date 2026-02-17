package week05;

import java.util.Arrays;

public class StringUtil{
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            char c = s.charAt(i);
            sb.append(c);
        }

        return sb.toString();

    }

    public static String explode(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {            
            for (int j = 0; j <= i; j++) {
                sb.append(s.charAt(j));
            }
        }
        return sb.toString();
    }

    public static String sort(String s){
        char[] l = s.toCharArray();
        Arrays.sort(l);
        return new String(l);
    }

    public static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) {
        return false;
    }
    String sorted1 = sort(s1);
    String sorted2 = sort(s2);
    return sorted1.equals(sorted2);
    }

    public static String mixed(String sentence) {    
        String[] words = sentence.split(" ");        
        StringBuilder sb = new StringBuilder();
        for (String word : words) {            
            if (word.length() > 1) {
                char first = word.charAt(0); 
                char last = word.charAt(word.length() - 1); 
                String middle = word.substring(1, word.length() - 1);
                sb.append(last).append(middle).append(first);
            } else {
                sb.append(word);
            }
            sb.append(" ");
        }
        
        return sb.toString().trim();
    }
    public static void main(String[] args){
        String s1 = "baku";
        System.out.println(mixed(s1));

    }

}