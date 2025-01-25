package BackTracking.Array;

public class FindPermutations {
    public static void Permutation(String str, String ans){
        // Base CAse
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        // Recursion
        for(int i=0; i < str.length(); i++){
            char curr = str.charAt(i);
            // abcde = "ab" + "de" = "abde" ------ when we want to remove c.
            String newStr = str.substring(0, i) + str.substring(i+1);
            Permutation(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "tushar";
        Permutation(str, "");
    }
}
