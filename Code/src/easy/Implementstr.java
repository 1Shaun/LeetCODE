package easy;

public class Implementstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "mississippi";
		String needle = "issipi";
		int index = strStr(haystack, needle);
		System.out.println(index);
	}
    public static int strStr(String haystack, String needle) {
    	int length1 = haystack.length();
    	int length2 = needle.length();
    	if(length2 == 0) return 0;
    	if(length2 > length1) return -1;
    	for (int i = 0; i < length1; i++) {
    		int k = i;
			if(haystack.charAt(i) == needle.charAt(0)) {
				for (int j = 0; j < length2; j++) {
					if(i <length1 && haystack.charAt(i) == needle.charAt(j)) {
						++i;
						if(j == length2-1)return k;
						
					}else {
						break;
					}
				}
				if((i - k) == length2) {
					return k;
				}else {
					i = k;
				}
				
			}
		}
        return -1;
    }

}
