package cn.javon.leetcode.easy._038_countandsay;

public class RankingCountAndSay {

    public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            result = convertUtil(result);
        }
        return result;
    }

    public String convertUtil(String input) {
        int j = 0;
        int counter = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            ++counter;
            if (i == input.length() - 1 || input.charAt(i) != input.charAt(i + 1)) {
                builder.append(counter);
                builder.append(input.charAt(i));
                counter = 0;
            }
        }
        return builder.toString();
    }
}
