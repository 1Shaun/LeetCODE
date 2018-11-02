package easy;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello world";
		int a = function(s);
		System.out.println(a);
	}
	public static int function(String s) {
		int i = s.length() - 1;
		int length = 0;
		while(i >= 0 && s.charAt(i) == ' ') {
			i--;
		}
		while (i >= 0 && s.charAt(i) != ' ') {
			length++;
			i--;
		}
		return length;
	}

}
