package easy;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {9,9,9};
		int[] digit = plusOne(digits); 
		for (int i = 0; i < digit.length; i++) {
			System.out.println(digit[i]);
		}
	}
	public static int[] plusOne(int[] digits) {
		int length = digits.length;
		for (int i = length-1; i >= 0; i--) {
			if(digits[i] == 9) {
				digits[i] = 0;
			}else {
				digits[i]++;
				break;
			}
			if(i == 0) {
				int[] digit = new int[length+1];
				digit[0] = 1;
				for (int j = 1; j < digit.length; j++) {
					digit[j] = 0;
				}
				return digit;
			}
		}
        return digits;
    }
}
