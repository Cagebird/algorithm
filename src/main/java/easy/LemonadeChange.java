package easy;

/**
 * @author takaibun
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five_count = 0, ten_count = 0, twelve_count = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five_count++;
            } else if (bill == 10) {
                if (five_count > 0) {
                    five_count--;
                    ten_count++;
                } else {
                    return false;
                }
            } else if (bill == 20) {
                if (five_count == 0) {
                    return false;
                }
                if (ten_count > 0) {
                    ten_count--;
                    five_count--;
                    twelve_count++;
                } else if (five_count >= 3) {
                    five_count -= 3;
                    twelve_count++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
