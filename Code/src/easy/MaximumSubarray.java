package easy;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int sum = maxSubArray(nums);
		System.out.println(sum);
	}	
	public static int maxSubArray(int[] nums) {
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		int max = nums[0];
		for (int i = 1, length = nums.length; i < length; i++) {
			dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
			max = Math.max(max, dp[i]);
		}
		
        return max;
		
    }

}
