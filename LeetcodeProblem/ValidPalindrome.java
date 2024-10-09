package LeetcodeProblem;

import java.lang.*;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isAPalindrome(str));
    }
    public static boolean isAPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        while (i < str.length()) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                sb.append(Character.toLowerCase(str.charAt(i)));  // Correctly append lowercase
            }
            i++;
        }
        System.out.println(sb);
        for(int j = 0; j < sb.length()/2; j++) {
            if(sb.charAt(j) != sb.charAt(sb.length() - 1 - j)) {
                return false;
            }
        }
        return  true;
    }

}
