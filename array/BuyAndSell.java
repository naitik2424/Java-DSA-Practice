package array;
public class BuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int mini = prices[0];
        int maxProfit = 0;
        int n = prices.length;
        for(int i=1;i<n;i++){
            int cost = prices[i] - mini;
            maxProfit = Math.max(maxProfit, cost);
            mini = Math.min(mini, prices[i]);      
        }
        System.out.println(maxProfit);
    }
}

