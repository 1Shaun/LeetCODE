package easy;


public class BuyandSellTwo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		int k = maxProfit(prices);
		System.out.println(k);
	}
	public static int maxProfit(int[] prices) {
//		 int maxprofit = 0;
//	        for (int i = 1; i < prices.length; i++) {
//	            if (prices[i] > prices[i - 1])
//	                maxprofit += prices[i] - prices[i - 1];
//	        }
//	        return maxprofit;

        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            	
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
		
		    
		
    }

}
