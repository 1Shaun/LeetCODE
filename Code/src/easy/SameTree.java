package easy;


import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode pNode = new TreeNode(1);
		pNode.left = new TreeNode(2);
		pNode.right = new TreeNode(3);
		TreeNode qNode = new TreeNode(1);
		qNode.left = new TreeNode(2);
		qNode.right = new TreeNode(3);
		boolean b = isSameTree1(pNode, qNode);
		System.out.println(b);	
		
	}
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null) {
			return true;
		}else if ((p == null && q != null) || (q == null && p != null)) {
			return false;
		}	
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
	
	public static boolean isSameTree1(TreeNode p, TreeNode q) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(p);
		queue.add(q);
		TreeNode m,n;
		while(!queue.isEmpty()) {
			m = queue.poll();
			n = queue.poll();
			if(m == null && n == null) {
				continue;
			}
			else if(m == null || n == null || m.val != n.val){
				return false;
			}
			queue.add(m.left);
			queue.add(n.left);
			queue.add(m.right);
			queue.add(n.right);
		}
		return true;
    }
	
	
	

}
