package easy;

import java.util.Arrays;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 1};
		boolean flag = containsDuplicate(nums);
		System.out.println(flag);
	}
	
	public static boolean containsDuplicate(int[] nums) {
		if(nums.length == 0 || nums.length == 1) return false;
		Arrays.sort(nums);
		for(int i = 1; i < nums.length; ++i) {
			if(nums[i - 1] == nums[i]) return true;
		}
		return false;
	}

}
