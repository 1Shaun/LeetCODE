package easy;

public class HouseRobber {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		int k = rob(nums);
		System.out.println(k);
	}
	public static int rob(int[] nums) {
		int length = nums.length;
		if(length == 0) return 0;
		if(length == 1) return nums[0];
		int[] ans = new int[length];
		ans[0] = nums[0];
		ans[1] = Math.max(ans[0], nums[1]);	
		for(int i = 2; i < length; i++) {
			ans[i] = Math.max(ans[i-1], ans[i-2]+nums[i]);
		}
		return ans[length-1];
	}

}
