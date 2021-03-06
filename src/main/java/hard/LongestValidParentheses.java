package hard;

/**
 * @author takaibun
 * <p>
 * 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
 */
public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        int len = s.length();
        int maxVal = 0;
        char[] str = s.toCharArray();
        int[] dp = new int[len];

        for (int i = 1; i < len; i++) {
            if (str[i] == ')') {
                if (str[i - 1] == '(') {
                    dp[i] = 2;
                    if (i - 2 >= 0) {
                        dp[i] = dp[i] + dp[i - 2];
                    }
                } else if (dp[i - 1] > 0) {
                    if ((i - dp[i - 1] - 1) >= 0 && str[i - dp[i - 1] - 1] == '(') {
                        dp[i] = dp[i - 1] + 2;
                        if ((i - dp[i - 1] - 2) >= 0) {
                            dp[i] = dp[i] + dp[i - dp[i - 1] - 2];
                        }
                    }
                }
            }
            maxVal = Math.max(maxVal, dp[i]);

        }

        return maxVal;
    }
}
