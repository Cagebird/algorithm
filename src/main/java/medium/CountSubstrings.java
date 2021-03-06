package medium;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 * @author takaibun
 * <p>
 * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
 * <p>
 * 示例 1：
 * <p>
 * 输入："abc"
 * 输出：3
 * 解释：三个回文子串: "a", "b", "c
 */
public class CountSubstrings {
    public int countSubstrings(String s) {
        int len = s.length();
        char[] str = s.toCharArray();
        boolean[][] dp = new boolean[len][len];

        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (str[i] == str[j]) {
                    if (j - i <= 1) {
                        result++;
                        dp[i][j] = true;
                    } else
                    if (dp[i + 1][j - 1]) {
                        result++;
                        dp[i][j] = true;
                    }
                }
            }
        }
        return result;

    }
}
