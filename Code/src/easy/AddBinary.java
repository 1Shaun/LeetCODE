package easy;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString = "1010";
		String bString = "1011";
		String cString = addBinary(aString, bString);
		System.out.println(cString);
	}
	public static String addBinary(String a, String b) {
    	String result = "";
		int la = a.length();
		int lb = b.length();
		if(la > lb) {
			int gap = la-lb;
			while(gap-- > 0) {
				b = 0 + b; 
			}
		}
		if(lb > la ) {
			int gap = lb - la;
			while(gap-->0) {
				a = 0 + a;
			}
		}
		int maxl = Math.max(la, lb);
		int c = 0,sum = 0;
		for(int i = --maxl; i>=0; --i) {
			sum = a.charAt(i)+b.charAt(i)+ c-'0'*2;
			if(sum > 1) {
				c = 1;
				sum -=2;
			}else {
				c = 0;
			}
			result = sum + result;
		}
		if(c ==1 ) {
			
			result = 1+result;
		}
		return result;
	}
}
