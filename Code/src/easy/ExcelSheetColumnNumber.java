package easy;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AB";
		int k = titleToNumber(s);
		System.out.println(k);
	}
	public static int titleToNumber(String s) {
		if(s.length() == 0) return 0;
		int length = s.length(),sum = 0,k = length-1;
		char[] cs = s.toCharArray();
		for(int i = 0; i < length; i++) {	
			sum +=(int) (Math.pow(26, k) * (cs[i] - 64));
			k--;
		}
		return sum;
	}

}
