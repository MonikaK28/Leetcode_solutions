import java.util.*;
class Solution {
    public int[] runningSum(int[] nums) {
        for(int num =1;num<nums.length;num++){
            nums[num]=nums[num]+nums[num-1];
        }
        return nums;
    }
}