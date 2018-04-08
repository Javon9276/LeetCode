package cn.javon.leetcode.easy._204_countprimes;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-04-08
 **/
public class TestCountPrimes {


    int n = 1000;

    @Test
    public void testMyCountPrimes() {
        MyCountPrimes myCountPrimes = new MyCountPrimes();
        System.out.println(myCountPrimes.countPrimes(n));
    }

}
