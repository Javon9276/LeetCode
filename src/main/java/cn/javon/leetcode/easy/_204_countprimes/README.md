# 204. Count Primes
Count the number of prime numbers less than a non-negative number, n.

# 204. 计数质数
计算所有小于非负数整数 n 的质数数量。

# My思路
原本是进行暴力破解
```
public int countPrimes(int n) {
    int count = 0;
    int i, j;
    for (i = 1; i < n; i++) {
        for (j = 2; j < i; j++) {
            if (i % j == 0) {  //
                break;
            }
        }
        if (i == j) {
            count++;
        }
    }
    return count;
}
```
超时，没办法了我就去Google了一下，于是知道了厄拉多塞筛法：

西元前250年，希腊数学家厄拉多塞(Eeatosthese)想到了一个非常美妙的质数筛法，减少了逐一检查每个数的的步骤，可以比较简单的从一大堆数字之中，筛选出质数来，这方法被称作厄拉多塞筛法(Sieve of Eeatosthese)。

具体操作：先将 2~n 的各个数放入表中，然后在2的上面画一个圆圈，然后划去2的其他倍数；第一个既未画圈又没有被划去的数是3，将它画圈，再划去3的其他倍数；现在既未画圈又没有被划去的第一个数 是5，将它画圈，并划去5的其他倍数……依次类推，一直到所有小于或等于 n 的各数都画了圈或划去为止。这时，表中画了圈的以及未划去的那些数正好就是小于 n 的素数。

其实，当你要画圈的素数的平方大于 n 时，那么后面没有划去的数都是素数，就不用继续判了。

```
public int countPrimes(int n) {
    boolean [] isPrime = new boolean[n];
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
```