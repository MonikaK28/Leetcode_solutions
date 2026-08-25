class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0,curmax=0,curmin=0;
        int maxsum=nums[0],minsum=nums[0];
        for(int i=0;i<nums.length;i++){
            curmax=Math.max(nums[i],curmax+nums[i]);
            maxsum=Math.max(curmax,maxsum);

            curmin=Math.min(nums[i],curmin+nums[i]);
            minsum=Math.min(curmin,minsum);

            total=total+nums[i];
        }
        if(maxsum<0){
            return maxsum;
        }
        return Math.max(maxsum,total-minsum);
    }
}