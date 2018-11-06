package easy;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3,m = 3;
		int[] num1 = {1,2,3,0,0,0};
		int[] num2 = {2,5,6};
		merge(num1,m,num2,n);
		
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = 0,j = 0,k = 0;
		int[] nums3 = new int[m+n];
		while(i < m&&j<n) {
			if(nums1[i]<=nums2[j]) {
				nums3[k] = nums1[i];
				k++;
				i++;
			}else {
				nums3[k] = nums2[j];
				j++;
				k++;			
			}
		}
		if(i >=m) {
			while(j<n) {
				nums3[k] = nums2[j];
				j++;
				k++;
			}
		}
		if(j >= n) {
			while(i<m) {
				nums3[k] = nums1[i];
				i++;
				k++;
			}
		}
		int a = 0;
		for(int o:nums3) {
			nums1[a] = o;
			a++;
		}
        
    }

}
