package cn.javon.leetcode.easy._088_mergesortedarray;

/**
 * @author Javon
 * @since 2018-02-07
 **/
public class MyMergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        } else {
            int maxIndex = m + n - 1;
            while (n > 0 && m > 0) {
                if (nums1[m - 1] > nums2[n - 1]) {
                    nums1[maxIndex--] = nums1[--m];
                } else {
                    nums1[maxIndex--] = nums2[--n];
                }
            }
            if (n > 0) {
                while (n > 0) {
                    nums1[maxIndex--] = nums2[--n];
                }
            }
        }
    }

}
