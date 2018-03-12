package cn.javon.leetcode.easy._168_excelsheetcolumntitle;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-03-12
 **/
public class TestExcelSheetColumnTitle {

    int n1 = 28; // AB
    int n2 = 53; // BA
    int n3 = 10000;
    int n4 = 26; // Z
    int n5 = 52; // AZ
    int n6 = 701; // AZ
    int n = n6;

    @Test
    public void testMyExcelSheetColumnTitle() {
        MyExcelSheetColumnTitle myExcelSheetColumnTitle = new MyExcelSheetColumnTitle();
        System.out.println(myExcelSheetColumnTitle.convertToTitle(n));
    }


    @Test
    public void testRankingExcelSheetColumnTitle() {
        RankingExcelSheetColumnTitle rankingExcelSheetColumnTitle = new RankingExcelSheetColumnTitle();
        System.out.println(rankingExcelSheetColumnTitle.convertToTitle(n));
    }

}
