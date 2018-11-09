package easy;

public class Sqrtx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;
		int y = mySqrt(x);
		System.out.println(y);
	}
	public static int mySqrt(int x) {
		if(x == 0) return 0;
		int l = 1;
		int r = x;
		int mid = (l + r)/2;
		while(l <= r) {
			if(mid == x/mid) {
				return mid;
			}else if(mid < x/mid) {
				l = mid + 1;
			}else{
				r = mid -1;
			}
			mid = (l+r)/2;
			
		}
        return mid;
    }

}
