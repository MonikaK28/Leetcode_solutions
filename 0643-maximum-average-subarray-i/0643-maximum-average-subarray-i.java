class Solution {
    public double findMaxAverage(int[] arr, int w) {
        int n=arr.length;
        int cursum=0;
        for(int i=0;i<w;i++){
            cursum=cursum+arr[i];
        }
        int maxsum=cursum;
        for(int i=w;i<n;i++){
            cursum=cursum-arr[i-w]+arr[i];
            if(cursum>maxsum){
                maxsum=cursum;
            }
        }
        return (double) maxsum/w;
    }
}