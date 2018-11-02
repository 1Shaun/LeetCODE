package easy;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,5,7,9};
		int target = 10;
		int k = searchInsert(nums, target);
		System.out.println(k);
	}
	
    public static int searchInsert(int[] nums, int target) {
    	if(nums.length == 0) return 0;
    	for (int i = 0; i < nums.length; i++) {
			if(nums[i] >= target) {
				return i;
			}
		}
        return nums.length;
    }
}
