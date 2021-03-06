package medium;

/**
 * @author takaibun
 */
public class MyAtoI {
    private static final int INT_MAX = 2147483647;
    private static final int INT_MIN = -2147483648;

    public int myAtoi(String s) {
        char[] str = s.toCharArray();
        int i=0;
        while(str.length>i&&str[i]==' '){
            i++;
        }
        int num = 0;
        int symbol = 2;
        boolean isOutOfBounds;
        for (; i < str.length; i++) {
            if (symbol == 2) {
                symbol = str[i] == '-' ? -1 : 1;
                if(str[i] == '-' || str[i] == '+'){
                    continue;
                }
            }
            if (str[i] < 48 || str[i] >= 58) {
                break;
            }
            if (num==0 && str[i] == 48) {
                continue;
            }
            isOutOfBounds = symbol == 1 ? num > (INT_MAX - (str[i] - '0')) / 10 : num < (INT_MIN + (str[i] - '0')) / 10;
            if (isOutOfBounds) {
                num = symbol == 1 ? INT_MAX : INT_MIN;
                break;
            }
            num = num * 10 + (str[i] - '0') * symbol;

        }
        return num;
    }
}
