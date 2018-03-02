package cn.javon.leetcode.easy._125_validpalindrome;

public class RankingValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            //System.out.println("Coming to while loop for i " + i + " J " + j);
            char lc = s.charAt(i);
            char rc = s.charAt(j);

            if ((lc < 65 || lc > 90) && (lc < 97 || lc > 122) && (lc < 48 || lc > 57)) {
                //System.out.println("Came here for char A " + rc);
                i++;
                continue;
            }

            //System.out.println("OUTSIDE A Came here for char " + lc);
            if ((rc < 65 || rc > 90) && (rc < 97 || rc > 122) && (rc < 48 || rc > 57)) {
                //System.out.println("Came here for char B" + rc);
                j--;
                continue;
            }
            //System.out.println("OUTSIDE Came here for char B" + rc);
            if (lc != rc) { // Mean either a is upper case or a is lower case
                //System.out.println("Coming here for lc " + lc  +  " rc " + rc);
                if (lc >= 65 && lc <= 90) {
                    return (lc - 'A') == (rc - 'a');
                    // if a is upper case then substract a from A which will give you [0-26]
                    // and substract rc from lower case which will also give you [0-26]
                }
                if (lc >= 97 && lc <= 122) {
                    return (lc - 'a') == (rc - 'A');
                    // if lc is lower case then substract lc from a(109) which will give you [0-26]
                    // and substract rc from uppercase A(65) which will also give you [0-26]
                }
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
