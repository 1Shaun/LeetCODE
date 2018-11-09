package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows = 3;
		List<Integer> list= generate(numRows);
		for(int k:list) {
			System.out.println(k);
		}
		
	}
	public static List<Integer> generate(int rowIndex) {
		List<List<Integer>> result= new ArrayList<>();
		List<Integer> result1 = new ArrayList<>();
		List<Integer> pre = new ArrayList<>();
		pre.add(1);
		result.add(pre);
		for(int i= 2; i<=rowIndex+1;++i) {
			List<Integer> cur = new ArrayList<>();
			cur.add(1);
			for(int j = 0; j < pre.size()-1; ++j) {
				int sum = pre.get(j) + pre.get(j+1);
				cur.add(sum);
			}
			cur.add(1);
			result.add(cur);
			pre = cur;
		}
		
		return result.get(rowIndex);
        
    }
}
