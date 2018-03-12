package cn.javon.leetcode.easy._168_excelsheetcolumntitle;

/**
 * @author Javon
 * @since 2018-03-12
 **/
public class MyExcelSheetColumnTitle {

    /**
     * 1. 1-26是 A-Z代表1
     * 2. 26以上 A-Z代表26
     */
    public String convertToTitle(int n) {
        if (n < 1) return null;
        StringBuilder sb = new StringBuilder();
        for (; n > 0; n = n / 26) {
            if (n % 26 == 0) {
                sb.insert(0,"Z");
                n = n - 26;
            } else {
                sb.insert(0, (char) (n % 26 + 64));
            }
        }
        return sb.toString();
    }

}
