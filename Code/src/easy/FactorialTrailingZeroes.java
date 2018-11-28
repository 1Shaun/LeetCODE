package easy;

public class FactorialTrailingZeroes {

	public static void main(String[] args) {
		int n = 10;
		n = trailingZeroes(n);
		System.out.println(n);
	}
	public static int trailingZeroes(int n) {
		int ans = 0;
		while(n > 0) {
			n /= 5;
			ans += n;
		}
        return ans;
    }
}
