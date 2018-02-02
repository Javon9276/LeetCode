package cn.javon.leetcode.easy._069_sqrt_x;

/**
 * @author Javon
 * @since 2018-02-02
 **/
public class MySqrtX {

    public int systemSqrtX(int x) {
        return (int) Math.sqrt(x);
    }

    /**
     * 思路：
     * 使用二分法进行查找元素
     */
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        while (low <= high) {
            long mid = (long) (low + high) / 2;
            if (mid * mid < x)
                low = (int) mid + 1;
            else if (mid * mid > x)
                high = (int) mid - 1;
            else
                return (int) mid;
        }
        return high;
    }
}
