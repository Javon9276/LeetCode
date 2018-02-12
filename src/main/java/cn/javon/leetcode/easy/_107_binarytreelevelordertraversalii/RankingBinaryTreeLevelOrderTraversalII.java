package cn.javon.leetcode.easy._107_binarytreelevelordertraversalii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RankingBinaryTreeLevelOrderTraversalII {

    /**
     * 思路：
     * 通过递归不断的进行数据录入
     * 每层都使用depth进行计数，然后插入对应的位置
     * 最后通过List工具类进行反转，以达到题目要求
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> out = new ArrayList<List<Integer>>();
        if (root == null) return out;
        traverse(out, root, 0);
        Collections.reverse(out);
        return out;
    }

    public void traverse(List<List<Integer>> out, TreeNode root, int depth) {
        if (root == null) return;
        // The slow will increase gradualy one by one -> add a new list when reaching a new depth
        if (depth == out.size()) out.add(new ArrayList<Integer>());
        traverse(out, root.left, depth + 1);
        out.get(depth).add(root.val);
        traverse(out, root.right, depth + 1);
    }
}