package cn.javon.leetcode.easy._205_isomorphicstrings;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-04-09
 **/
public class TestIsomorphicStrings {

    String s1 = "\"egg";
    String t1 = "badd";

    String s2 = "foo";
    String t2 = "bar";

    String s3 = "paper";
    String t3 = "title";


    String s = s1;
    String t = t1;

    @Test
    public void testMyIsomorphicStrings() {
        MyIsomorphicStrings myIsomorphicStrings = new MyIsomorphicStrings();
        System.out.println(myIsomorphicStrings.isIsomorphic(s, t));
    }

}
