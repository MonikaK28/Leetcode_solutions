class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int n=arr.length;
        int cursum=0;
        for(int i=0;i<k;i++){
            cursum=cursum+arr[i];
        }
        if(cursum>=k*threshold){
            count++;
        }
        for(int i=k;i<n;i++){
            cursum=cursum-arr[i-k]+arr[i];
            if(cursum>=k*threshold){
                count++;
            }
        }
        return count;
    }
}