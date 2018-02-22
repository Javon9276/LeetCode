package cn.javon.leetcode.easy._111_minimumdepthofbinarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Javon
 * @since 2018-02-22
 **/
public class MyMinimumDepthofBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null)
            return minDepth(root.right) + 1;
        if (root.right == null)
            return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

}
