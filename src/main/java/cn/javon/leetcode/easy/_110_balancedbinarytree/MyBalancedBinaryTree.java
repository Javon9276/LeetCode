package cn.javon.leetcode.easy._110_balancedbinarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Javon
 * @since 2018-02-13
 **/
public class MyBalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int left = depath(root.left);
        int right = depath(root.right);
        if (left - right > 1 || right - left > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    /**
     * 求树的深度
     */
    public int depath(TreeNode root) {
        int count = 0;
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                while (size-- > 0) {
                    TreeNode node = queue.poll();
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
                count++;
            }
        }
        return count;
    }


//    public boolean isBalanced(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        int left = depth(root.left);
//        int right = depth(root.right);
//        if (left - right > 1 || left - right < -1) {
//            return false;
//        } else {
//            return isBalanced(root.left) && isBalanced(root.right);
//        }
//    }
//
//    /**
//     * 求树的高度
//     * @param n 树的根结点
//     * @return 树的高度
//     */
//    private int depth(TreeNode n) {
//        if (n == null) {
//            return 0;
//        }  if (n.left == null && n.right == null) {
//            return 1;
//        } else {
//            int left = depth(n.left);
//            int right = depth(n.right);
//            return 1 + (left > right ? left : right);
//        }
//    }

}
