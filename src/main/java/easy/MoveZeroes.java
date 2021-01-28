package easy;

/**
 * @author takaibun
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int idx=0;
        for (int i = 0;i < nums.length;i++ ){
            if(nums[i]==0){
                idx++;
            }else{
                nums[i-idx]=nums[i];
            }
        }
        for(;idx>0;idx--){
            nums[nums.length-idx]=0;
        }
    }
}
