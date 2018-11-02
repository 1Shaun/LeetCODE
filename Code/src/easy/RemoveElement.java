package easy;


public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,2,4,3};
		int val = 3;
		int sum= function(nums,val);
		for (int i: nums) {
			System.out.print(i);
		}
		System.out.println(sum);
	}
	
	public static int function(int[]nums ,int val){
		int i = 0;
		for (int n = 0; n < nums.length; n++) {
			if(nums[n] != val) {
				nums[i++] = nums[n];
				
			}
		}
		return i;				
	}
}
