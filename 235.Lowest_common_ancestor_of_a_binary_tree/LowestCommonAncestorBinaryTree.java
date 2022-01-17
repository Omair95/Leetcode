
public class LowestCommonAncestorBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root.val < q.val && root.val > p.val) return root;
        if (root.val < q.val && root.val < p.val) return lowestCommonAncestor(root.right, p, q);
        if (root.val > q.val && root.val > p.val) return lowestCommonAncestor(root.left, p, q);
        return root;
    }

    public static void main (String[] args) {

    }
}