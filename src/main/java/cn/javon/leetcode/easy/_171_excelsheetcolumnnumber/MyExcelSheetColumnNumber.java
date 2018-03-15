package cn.javon.leetcode.easy._171_excelsheetcolumnnumber;

/**
 * @author Javon
 * @since 2018-03-15
 **/
public class MyExcelSheetColumnNumber {


    public int titleToNumber(String s) {
        int number = 0;
        int factorial = 1;
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            number += (chars[i] - 'A' + 1) * factorial;
            factorial *= 26;
        }
        return number;
    }

}
