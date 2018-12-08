package easy;

public class AddDigits {

	public static void main(String[] args) {
		int num = 38;
		num = addDigits(num);
		System.out.println(num);
		
	}
	public static int addDigits(int num) {
		if(num < 10) return num;
		while(num > 9) {
			int sum = 0;
			String s = String.valueOf(num);
			char[] cs = s.toCharArray();
//			System.out.println(cs);
//			System.out.println(cs[2] - 48);
			for(char c: cs) {
				sum += (c - 48);
//				System.out.println(c);
			}
			num = sum;
		}		
        return num;
    }
}
