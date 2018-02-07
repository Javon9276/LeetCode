package cn.javon.leetcode.easy._088_mergesortedarray;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-02-07
 **/
public class TestMergeSortedArray {

//    int[] nums1 = new int[]{1,2,3,4,0,0,0,0};
//    int m = 4;
//    int[] nums2 = new int[]{1,3,5,6};
//    int n = 4;

//    int[] nums1 = new int[]{2,0};
//    int m = 1;
//    int[] nums2 = new int[]{1};
//    int n = 1;

//    int[] nums1 = new int[]{1,2,3,0,0,0};
//    int m = 3;
//    int[] nums2 = new int[]{2,5,6};
//    int n = 3;

    int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
    int m = 3;
    int[] nums2 = new int[]{1, 2, 3};
    int n = 3;

    @Test
    public void testMyMergeSortedArray() {
        MyMergeSortedArray myMergeSortedArray = new MyMergeSortedArray();
        myMergeSortedArray.merge(nums1, m, nums2, n);
    }

    @Test
    public void testRankingMergeSortedArray() {
        RankingMergeSortedArray rankingMergeSortedArray = new RankingMergeSortedArray();
        rankingMergeSortedArray.merge(nums1, m, nums2, n);
    }
}
