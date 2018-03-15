package cn.javon.leetcode.easy._171_excelsheetcolumnnumber;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-03-15
 **/
public class TestExcelSheetColumnNumber {

    String s1 = "B";//2
    String s2 = "AB";//28
    String s3 = "AAA"; // 703
    String s4 = "ABA"; // 729
    String s = s3;

    @Test
    public void testMyExcelSheetColumnNumber() {
        MyExcelSheetColumnNumber myExcelSheetColumnNumber = new MyExcelSheetColumnNumber();
        System.out.println(myExcelSheetColumnNumber.titleToNumber(s));
    }

}
