package easy;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int k = climbStairs(n);
		System.out.println(k);
		
	}
	public static int climbStairs(int n) {
		if(n == 1) return 1;
		if(n == 2) return 2;
		int[] nums = new int[n];
		nums[0] = 1;
		nums[1] = 2;
		for(int i = 2; i < n; i++) {
			nums[i] = nums[i-1]+nums[i-2];
		}
        return nums[n-1];
    }

}
