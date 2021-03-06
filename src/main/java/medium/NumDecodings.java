package medium;

/**
 * @author takaibun
 * <p>
 * 一条包含字母A-Z 的消息通过以下映射进行了 编码 ：
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * 要 解码 已编码的消息，所有数字必须基于上述映射的方法，反向映射回字母（可能有多种方法）。例如，"111" 可以将 "1" 中的每个 "1" 映射为 "A" ，从而得到 "AAA" ，或者可以将 "11" 和 "1"（分别为 "K" 和 "A" ）映射为 "KA" 。注意，"06" 不能映射为 "F" ，因为 "6" 和 "06" 不同。
 * <p>
 * 给你一个只含数字的 非空 字符串 num ，请计算并返回 解码 方法的 总数 。
 * <p>
 * 题目数据保证答案肯定是一个 32 位 的整数。
 */
public class NumDecodings {

    public int numDecodings(String s) {
        char[] strArray = s.toCharArray();
        int[] opt = new int[strArray.length];
        if (strArray[0] == '0') {
            return 0;
        } else {
            opt[0] = 1;
        }
        for (int i = 1; i < strArray.length; i++) {
            int num = (strArray[i - 1] - '0') * 10 + (strArray[i] - '0');
            if (strArray[i] != '0') {
                opt[i] = opt[i - 1];
            }
            if (num >= 10 && num <= 26) {
                opt[i] += i > 2 ? opt[i - 2] : 1;
            }

        }
        return opt[strArray.length - 1];
    }
}
