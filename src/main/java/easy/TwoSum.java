package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author takaibun
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target-nums[i]),i};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }
}