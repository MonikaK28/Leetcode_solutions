class Solution {
    public int maxSubArray(int[] arr) {
        int cur_sum = arr[0],max_sum=arr[0];
        for(int i=1;i<arr.length;i++){
            cur_sum = Math.max(arr[i],arr[i]+cur_sum);
            max_sum=Math.max(cur_sum,max_sum);
        }
        return max_sum;
    }
}