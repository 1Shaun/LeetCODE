package easy;



public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		int n = 28;
		String string = convertToTitle(n);
		System.out.println(string);
	}
    private static char[] map = new char[27];  
    static {  
        for (int i = 1;i <= 26; i++) {  
            map[i] = (char)('A' + i - 1);  
        }  
    }
    public static String convertToTitle(int n) {
    	 StringBuilder res = new StringBuilder();  
         while (n > 0) {  
             int mod = n % 26;  
             if (mod == 0) {  
                 res.append('Z');  
                 n -= 26;  
             } else {  
                 res.append(map[mod]);  
             }  
             n /= 26;  
         }  
         return res.reverse().toString();  

    }

}
