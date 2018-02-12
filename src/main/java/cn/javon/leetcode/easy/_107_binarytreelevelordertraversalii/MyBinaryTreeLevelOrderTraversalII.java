package cn.javon.leetcode.easy._107_binarytreelevelordertraversalii;

import java.util.*;

/**
 * @author Javon
 * @since 2018-02-12
 **/
public class MyBinaryTreeLevelOrderTraversalII {

    /**
     * 思路：
     * 使用BFS的思路进行查询数据
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if (root == null) return lists;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> integers = new ArrayList<Integer>();
            int size = queue.size();
            while (size-- > 0) {
                TreeNode node = queue.poll();
                integers.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            lists.add(integers);
        }
        Collections.reverse(lists);
        return lists;
    }

}
