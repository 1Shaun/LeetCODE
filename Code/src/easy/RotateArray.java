package easy;


public class RotateArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		rotate(nums, 3);
	}
	public static void rotate(int[] nums, int k) {
        int i = 0, len = nums.length - 1;
        while( i < k) {
        	int temp = nums[len];
        	for(int j = len; j > 0; j--) {
        		nums[j] = nums[j - 1];
        	}
        	nums[0] = temp;
        	i++;
        }
        for(int o:nums) {
        	System.out.println(o);
        }
    }

}
