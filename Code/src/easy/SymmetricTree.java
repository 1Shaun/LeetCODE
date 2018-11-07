package easy;

public class SymmetricTree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode pNode = new TreeNode(1);
		TreeNode lp = new TreeNode(2);
		TreeNode rp = new TreeNode(2);
		pNode.left = lp;
		pNode.right = rp;
		lp.left = new TreeNode(3);
		lp.right = new TreeNode(4);
		rp.left = new TreeNode(4);
		rp.right = new TreeNode(3);
		boolean b = isSymmetric(pNode);
		System.out.println(b);	
	}
	public static boolean isSymmetric(TreeNode root) {
		if(root == null) return true;
		else return isSymmetric(root.left, root.right);
    }
	private static boolean isSymmetric(TreeNode left, TreeNode right) {
		if(left == null && right == null) return true;
		else if (left == null || right == null) {
			return false;
		}		
		return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right,right.left);
    }
}
