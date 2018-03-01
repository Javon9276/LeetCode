# Best Time to Buy and Sell Stock II
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

# 买卖股票的最佳时机 II
假设有一个数组，它的第 i 个元素是一个给定的股票在第 i 天的价格。

设计一个算法来找到最大的利润。你可以完成尽可能多的交易（多次买卖股票）。然而，你不能同时参与多个交易（你必须在再次购买前出售股票）。

# My思路
最简单的方法就是每天计算价格，今天的价格比昨天高就计算得到当天收益。最后相加起来就是最终结果。
```
int maxprofit = 0;
for (int i = 1; i < prices.length; i++) {
    if (prices[i] > prices[i - 1])
        maxprofit += prices[i] - prices[i - 1];
}
return maxprofit;
```
不明白官方为啥还有这么多这么复杂的方法。