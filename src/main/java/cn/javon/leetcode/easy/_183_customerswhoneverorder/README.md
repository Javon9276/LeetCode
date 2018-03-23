# 183. Customers Who Never Order
Suppose that a website contains two tables, the Customers table and the Orders table. Write a SQL query to find all customers who never order anything.

Table: Customers.
```
+----+-------+
| Id | Name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |
+----+-------+
```
Table: Orders.
```
+----+------------+
| Id | CustomerId |
+----+------------+
| 1  | 3          |
| 2  | 1          |
+----+------------+
```
Using the above tables as example, return the following:
```
+-----------+
| Customers |
+-----------+
| Henry     |
| Max       |
+-----------+
```

# 183. 从不订购的客户
假设一个网站包含两个表，Customers 表和 Orders 表。编写一个SQL语句找出所有从不订购任何东西的客户。

表名： Customers。
```
+----+-------+
| Id | Name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |
+----+-------+
```
Table: Orders.
```
+----+------------+
| Id | CustomerId |
+----+------------+
| 1  | 3          |
| 2  | 1          |
+----+------------+
```
以上述表格为例，返回以下内容：
```
+-----------+
| Customers |
+-----------+
| Henry     |
| Max       |
+-----------+
```