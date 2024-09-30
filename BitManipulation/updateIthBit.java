package BitManipulation;

public class updateIthBit {
    public static int updateBit(int n, int i, int newBit) {
       if(newBit == 0) {
           return clearIthBit.clearBit(n,i);
       }
       else {
           return setIthBit.setBit(n,i);
       }
    }

    public static void main(String[] args) {
        System.out.println(updateBit(10,1,0));
    }
}
