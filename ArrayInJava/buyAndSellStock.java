package ArrayInJava;

public class buyAndSellStock {
    public  static int profit(int[] price){
        int MaxProfit = 0;
        int buyPrice = price[0];
        for(int i=1; i<price.length; i++){
            MaxProfit = Math.max((price[i] - buyPrice), MaxProfit );
            buyPrice = Math.min(price[i], buyPrice);
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        System.out.println("Maximum Profit is: " + profit(price));
    }
}
