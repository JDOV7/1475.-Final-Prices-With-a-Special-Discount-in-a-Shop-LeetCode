package leetcode;

public class FinalPricesWithaSpecialDiscountinaShop1475 {

    public void FinalPricesWithaSpecialDiscountinaShop1475() {
        int[] prices = {10, 1, 1, 6};
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
    }
}
