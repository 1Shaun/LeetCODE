package easy;

public class BuyandSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {1,2};
		int k = maxProfit(prices);
		System.out.println(k);
	}
	public static int maxProfit(int[] prices) {
		int k = 0,m;
		for(int i = prices.length - 1;i > 0 ;i--) {
			for(int j = i - 1; j>=0;j--) {
				m = prices[i] - prices[j];
				if(m>=0&&m>k) k = m;
			}
			
		}
		return k;
    }

}
