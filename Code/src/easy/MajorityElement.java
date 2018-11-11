package easy;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2};
		int k = majorityElement(nums);
		System.out.println(k);
		
	}
	public static int majorityElement(int[] nums) {		
		Arrays.sort(nums);
		double length = nums.length;
		if(length == 1) return nums[0];
		int n = (int) Math.floor(length/2);
		int k = 1;
		for(int i = 1; i < length; i++) {
			if(nums[i] == nums[i - 1]) {
				k++;
				if(k > n) return nums[i];
			}else {
				k = 1;
			}
		}
        return 0;
    }

}
