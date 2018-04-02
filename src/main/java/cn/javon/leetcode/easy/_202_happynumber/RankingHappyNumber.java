package cn.javon.leetcode.easy._202_happynumber;

public class RankingHappyNumber {

    public boolean isHappy(int n) {
        while (n != 1) {
            n = getnum(n);
            if (n == 4) {
                return false;
            }
        }
        return true;
    }

    public int getnum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }

}
