package week05;

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
    public static void main(String[] args){
        String s1 = "Hello";
        System.out.println(explode(s1));

    }

}