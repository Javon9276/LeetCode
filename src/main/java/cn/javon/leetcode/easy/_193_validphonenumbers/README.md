# 193. Valid Phone Numbers
Given a text file `file.txt` that contains list of phone numbers (one per line), write a one liner bash script to print all valid phone numbers.

You may assume that a valid phone number must appear in one of the following two formats: (xxx) xxx-xxxx or xxx-xxx-xxxx. (x means a digit)

You may also assume each line in the text file must not contain leading or trailing white spaces.

For example, assume that `file.txt` has the following content:
```
987-123-4567
123 456 7890
(123) 456-7890
```
Your script should output the following valid phone numbers:
```
987-123-4567
(123) 456-7890
```

# 193. 有效电话号码
给一个文本文件 `file.txt` ，包括了一个电话号码的列表（一行一个），写一个 bash 脚本打印所有有效的电话号码。

你可以假定一个有效的电话号码必须以下列两种格式之一出现： (xxx) xxx-xxxx 或者 xxx-xxx-xxxx。（x 表示一个数字）

你也可以假定每行前后没有多余的空格。

例如，假设 `file.txt` 包括下面的内容：
```
987-123-4567
123 456 7890
(123) 456-7890
```
你的脚本应当输出下面这些有效的电话号码：
```
987-123-4567
(123) 456-7890
```

# My思路
此题的关键，正则表达式的匹配。
```
grep -P '^(\d{3}-|\(\d{3}\) )\d{3}-\d{4}$' file.txt
```