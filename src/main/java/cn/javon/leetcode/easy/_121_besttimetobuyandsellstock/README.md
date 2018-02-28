# Best Time to Buy and Sell Stock
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:
```
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
```
Example 2:
```
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.
```

# 买卖股票的最佳时机
假设你有一个数组，其中第 i 个元素是一支给定股票第 i 天的价格。

如果您只能完成最多一笔交易（即买入和卖出一股股票），则设计一个算法来找到最大的利润。

示例 1:
```
输入: [7, 1, 5, 3, 6, 4]
输出: 5

最大利润 = 6-1 = 5（不是 7-1 = 6, 因为卖出价格需要大于买入价格）
```

示例 2:
```
输入: [7, 6, 4, 3, 1]
输出: 0

在这种情况下, 没有交易完成, 即最大利润为 0。
```

# My思路
第一想法是使用两个for循环进行操作得到相对应的结果，并且比较最大值。但是时间复杂度比较大
```
public int maxProfit(int prices[]) {
    int maxprofit = 0;
    for (int i = 0; i < prices.length - 1; i++) {
        for (int j = i + 1; j < prices.length; j++) {
            int profit = prices[j] - prices[i];
            if (profit > maxprofit)
                maxprofit = profit;
        }
    }
    return maxprofit;
}
```

# Official思路
第二想法就是这个，优先找出相对最小值，然后计算结果，得到最大值，如果出现更小值，使用更小值的区间进行比较。
```
public int maxProfit(int prices[]) {
    int maxprofit = 0;
    for (int i = 0; i < prices.length - 1; i++) {
        for (int j = i + 1; j < prices.length; j++) {
            int profit = prices[j] - prices[i];
            if (profit > maxprofit)
                maxprofit = profit;
        }
    }
    return maxprofit;
}
```

# Ranking思路
只是把max和min换成下标计算，与Official思路差异不大。
```
public int maxProfit(int prices[]) {
    if (prices == null || prices.length <= 1)
        return 0;
    int buyIndex = 0;
    int sellIndex = 0;
    int maxProfit = 0;
    for (int i = 1; i < prices.length; i++) {
        if (prices[i] < prices[buyIndex]) {
            buyIndex = i;
        } else {
            maxProfit = Math.max(prices[i] - prices[buyIndex], maxProfit);
        }
    }
    return maxProfit;
}
```