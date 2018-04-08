package cn.javon.leetcode.easy._204_countprimes;

/**
 * @author Javon
 * @since 2018-04-08
 **/
public class MyCountPrimes {

    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = true;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isPrime[i]) count++;
        }
        return count;
    }

}
