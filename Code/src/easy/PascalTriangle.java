package easy;

import java.util.List;
import java.util.ArrayList;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows = 5;
		List<List<Integer>> list= generate(numRows);
		for(List<Integer> list1 : list) {
			for(int k:list1) {
				System.out.println(k);
			}
		}
	}
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result= new ArrayList<>();
		if(numRows == 0) return result;
		List<Integer> pre = new ArrayList<>();
		pre.add(1);
		result.add(pre);
		for(int i= 2; i<=numRows;++i) {
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
		return result;
        
    }
}
