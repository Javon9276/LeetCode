package cn.javon.leetcode.easy._202_happynumber;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Javon
 * @since 2018-04-02
 **/
public class MyHappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> result = new HashSet<Integer>();
        while (n != 1) {
            if (result.contains(n))
                return false;
            result.add(n);
            int sum = 0;
            while (n != 0) {
                int remainder = n % 10;
                sum += remainder * remainder;
                n /= 10;
            }
            n = sum;
        }
        return true;
    }

}
