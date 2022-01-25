import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    public static void levelOrderHelper(List<List<Integer>> res, TreeNode root, Integer height) {
        if (root == null) return;

        if (height == res.size()) {
            res.add(new ArrayList<>());
        }

        res.get(height).add(root.val);
        levelOrderHelper(res, root.left, height + 1);
        levelOrderHelper(res, root.right, height + 1);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        levelOrderHelper(res, root, 0);

        return res;
    }

    public static void main (String [] args) {

    }
}