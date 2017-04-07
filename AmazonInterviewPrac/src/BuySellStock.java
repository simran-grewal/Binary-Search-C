/**
 * Created by i_amg on 07-04-2017.
 */
public class BuySellStock
{
    public static int MaximumProfit(int[] stockPrices){

        int profit = 0;
        int minimumPrice = Integer.MAX_VALUE;

        for(int i = 0; i < stockPrices.length; i++){

            profit = Math.max(profit, stockPrices[i] - minimumPrice);
            minimumPrice = Math.min(stockPrices[i], minimumPrice);
        }

        return profit;
    }
    public static void main(String[] args) {
        int[] stockPrices = {100, 80, 120, 130, 70, 60, 100, 125};

        System.out.println("Maximum profit =" + MaximumProfit(stockPrices));

    }
}
