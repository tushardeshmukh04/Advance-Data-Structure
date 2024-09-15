package StringInJava;

public class substring {
    public static String printSubstring(String str, int si, int ei) {
        String substr = "";
        for(int i=si; i < ei ; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println("By using Function->");
        System.out.println(str.substring(0,5));//fifth index not be print
        System.out.println("by using brute force method->");
        String str1 =printSubstring(str, 0, 5);
        System.out.println(str1);
    }
}
