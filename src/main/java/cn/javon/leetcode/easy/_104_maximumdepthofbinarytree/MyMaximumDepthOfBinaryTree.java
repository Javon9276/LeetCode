package cn.javon.leetcode.easy._104_maximumdepthofbinarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Javon
 * @since 2018-02-11
 **/
public class MyMaximumDepthOfBinaryTree {

    /**
     * 思路：
     * 相当于BFS（宽度优先搜索算法（又称广度优先搜索））
     */
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int count = 0;
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
        return count;
    }

}
