package easy;

public class PowerofTwo {

	public static void main(String[] args) {
		int n = 2;
		boolean flag = isPowerOfTwo(n);
		System.out.println(flag);
	}
    public static boolean isPowerOfTwo(int n) {
    	if(n == 1) return true;
    	double f = n;
    	while(f >= 1) {
    		f = f / 2;	
    		if(f == 1) {
    			return true;
    		}
    	}
        return false;
    }

}
