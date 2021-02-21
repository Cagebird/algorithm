package medium;

import java.util.Arrays;

/**
 * @author takaibun
 */
public class Rotate {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int copyLen = k % len;
        if (copyLen == 0) {
            return;
        }
        int[] copy = Arrays.copyOf(nums, k % len);
        for (int i = len - 1; i > 0; i--) {
            nums[(i + copyLen) % len] = nums[i];
        }
        for (int i = 0; i < copyLen; i++) {
            nums[(i + copyLen) % len] = copy[i];
        }
    }

    public void rotate2(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if (k == 0) {
            return;
        }
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
    }
}
