package easy;

public class MaximumDepthofBinaryTree {
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
		int b = maxDepth(pNode);
		System.out.println(b);	
	}
	public static int maxDepth(TreeNode root) {
		if(root == null) return 0;
		int l = maxDepth(root.left);
		int r = maxDepth(root.right);
		return Math.max(l, r)+1;
    }
}
