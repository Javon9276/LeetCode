# 197. Rising Temperature

Given a `Weather` table, write a SQL query to find all dates' Ids with higher temperature compared to its previous (yesterday's) dates.
```
+---------+------------+------------------+
| Id(INT) | Date(DATE) | Temperature(INT) |
+---------+------------+------------------+
|       1 | 2015-01-01 |               10 |
|       2 | 2015-01-02 |               25 |
|       3 | 2015-01-03 |               20 |
|       4 | 2015-01-04 |               30 |
+---------+------------+------------------+
```
For example, return the following Ids for the above Weather table:
```
+----+
| Id |
+----+
|  2 |
|  4 |
+----+
```

# 197. 上升的温度
给定一个 `Weather` 表，编写一个SQL查询来查找与之前(昨天的)日期相比温度更高的所有日期的id。
```
+---------+------------+------------------+
| Id(INT) | Date(DATE) | Temperature(INT) |
+---------+------------+------------------+
|       1 | 2015-01-01 |               10 |
|       2 | 2015-01-02 |               25 |
|       3 | 2015-01-03 |               20 |
|       4 | 2015-01-04 |               30 |
+---------+------------+------------------+
```
例如，返回上述天气表的id:
```
+----+
| Id |
+----+
|  2 |
|  4 |
+----+
```