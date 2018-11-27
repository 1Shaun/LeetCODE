package easy;

public class Numberof1Bits {

	public static void main(String[] args) {
		int n = 0;
		n = hammingWeight(n);
		System.out.println(n);
	}
	public static int hammingWeight(int n) {
		String s = Integer.toBinaryString(n);
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			if((s.charAt(i) - 48) == 1)
				sum++;
		}
	    return sum;     
	}

}
