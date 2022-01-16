import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthBinaryTree {

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

    public static int maxDepthRecursiveDFS(TreeNode root) {
        if (root == null) return 0;
        else return 1 + Math.max(maxDepthRecursiveDFS(root.left), maxDepthRecursiveDFS(root.right));
    }

    public static int maxDepthIterativeBFS(TreeNode root) {
        if (root == null) return 0;
        int depth = 0;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);

        while (!nodes.isEmpty()) {
            int size = nodes.size();
            depth++;
            while (size-- > 0) {
                TreeNode node = nodes.poll();
                if (node.left != null) nodes.offer(node.left);
                if (node.right != null) nodes.offer(node.right);
            }
        }
        return depth;
    }

    public static void main (String[] args) {

    }
}