package StringInJava;

import java.sql.SQLOutput;

public class concatenationInString {
    public static void concatenate(String str1, String str2) {
        String str3 = str1 + " " + str2;
        System.out.println(str3);
    }
    public static void main(String[] args) {
        String str1 = "Tushar";
        String str2 = "Deshmukh";
        concatenate(str1, str2);
        
    }

}
