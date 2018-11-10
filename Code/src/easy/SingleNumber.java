package easy;

import java.util.Arrays;


public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = {2,2,1};
		int k = singleNumber(nums);
		System.out.println(k);

	}
	public static int singleNumber(int[] nums) {
		if(nums.length == 1) return nums[0];
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i+=2) {
			if(i == nums.length-1) return nums[i];
			if(nums[i] != nums[i+1]) return nums[i];
		}
		return 0;
	}

}
