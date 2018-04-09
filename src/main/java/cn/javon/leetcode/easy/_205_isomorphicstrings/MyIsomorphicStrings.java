package cn.javon.leetcode.easy._205_isomorphicstrings;

/**
 * @author Javon
 * @since 2018-04-09
 **/
public class MyIsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        int[] mapS = new int[128];
        int[] mapT = new int[128];
        for(int i = 0; i < s.length(); i++){
            if(mapS[s.charAt(i)] != mapT[t.charAt(i)])
                return false;
            mapS[s.charAt(i)] = mapT[t.charAt(i)] = i + 1;
        }
        return true;
    }

}
