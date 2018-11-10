package easy;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "0p";
		boolean flag = isPalindrome(s);
		System.out.println(flag);
		
	}
	 public static boolean isPalindrome(String s) {
	 	if(s.length() == 0) return true;
	 	String upper = s.toUpperCase();
	 	char[] nums = upper.toCharArray();
	 	StringBuffer sb = new StringBuffer();
	 	for(int i = 0; i < nums.length; i++) {
	 		if((nums[i] >= 65 && nums[i] <= 90) || (nums[i] >= 48 && nums[i] <= 57)) 
	 			sb.append(nums[i]);
	 	}
	 	String s1 = sb.toString();
	 	String s2 = sb.reverse().toString();
	 	if(s1.equals(s2)) return true;
	 	else return false;
	  }
}
