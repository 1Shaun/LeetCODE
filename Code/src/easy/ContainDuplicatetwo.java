package easy;

public class ContainDuplicatetwo {

	public static void main(String[] args) {
		int[] nums = {1,0,1,1};
		int k = 1;
		boolean flag = containsNearbyDuplicate(nums, k);
		System.out.println(flag);
	}
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		if(nums.length == 0 && nums.length == 1) return false;
		for(int i = 0; i < nums.length; ++i) {
			for(int j = i+1; j - i <= k && j<nums.length; ++j) {
				if(nums[j] == nums[i]) return true;		
			}		
		}
	    return false;
	}

}
