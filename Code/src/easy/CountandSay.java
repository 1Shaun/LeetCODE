package easy;


public class CountandSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		String s = countAndSay(n);
		System.out.println(s);
	}
	public static String countAndSay(int n) {
		String s = "1";
		for(int i = 1;i < n; ++i) {
			s = count(s);
		}
		return s;
    }
	public static String count(String s) {
		char[] cs = s.toCharArray();
		int num = 1;
		StringBuffer buffer = new StringBuffer();
		for(int i = 1; i < cs.length; ++i) {
			if(cs[i - 1] == cs[i]) num++;
			else {
				buffer.append(num + String.valueOf(cs[i-1]));
				num = 1;
			}
		}
		buffer.append(num + String.valueOf(cs[cs.length-1]));//处理最后一个
		return buffer.toString();
	}
	

}
