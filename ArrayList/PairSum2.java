package ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    public static boolean findPair2(ArrayList<Integer> list, int target){
        int bp = 0; // break point
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp + 1; // smallest element
        int rp = bp; // largest element
        int n = list.size();
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp) + list.get(rp) < target){
               lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(findPair2(list, 24));
    }
}
