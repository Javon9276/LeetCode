package cn.javon.leetcode.easy._070_climbingstairs;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-02-05
 **/
public class TestClimbingStairs {

    int n = 2;

//    int n = 3;

    @Test
    public void testMyClimbingStairs(){
        MyClimbingStairs myClimbingStairs = new MyClimbingStairs();
        System.out.println(myClimbingStairs.climbStairs(n));
    }

    @Test
    public void testOfficialClimbingStairs(){
        OfficialClimbingStairs officialClimbingStairs = new OfficialClimbingStairs();
        System.out.println(officialClimbingStairs.bf_ClimbStairs(n));
        System.out.println(officialClimbingStairs.rwm_climbStairs(n));
        System.out.println(officialClimbingStairs.dp_climbStairs(n));
        System.out.println(officialClimbingStairs.fn_climbStairs(n));
        System.out.println(officialClimbingStairs.bm_climbStairs(n));
        System.out.println(officialClimbingStairs.ff_climbStairs(n));
    }
}
