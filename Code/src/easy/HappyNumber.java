package easy;

import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		boolean f = isHappy(n);
		System.out.println(f);
		
	}
	public static boolean isHappy(int n) {
		if(n < 1) return false;
		int temp,newN;
		HashSet<Integer> set = new HashSet<>();		
		while(n != 1 && !set.contains(n)) { //循环时，n会与之前的某个n相等；
			set.add(n);	
			newN = 0;
			while(n > 0) {
				temp = n % 10;
				n /= 10;
				newN += temp * temp;
			}
			n = newN;
		}
	    return n == 1;
	}

}
