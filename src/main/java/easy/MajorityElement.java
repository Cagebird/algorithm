package easy;

import java.util.Arrays;

/**
 * @author takaibun
 */
public class MajorityElement {
    /**
     * @param nums
     * @return 这个解法非常巧妙，因为多数元素的个数大于length/2，所以length/2处的元素必定是多数元素
     */
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length >> 1];
    }
}
