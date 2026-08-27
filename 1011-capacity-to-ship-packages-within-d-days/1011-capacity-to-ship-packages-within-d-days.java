class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0,right=0;// left is the heaviest package, right is the sum of all packages
        for(int w:weights){
            left=Math.max(left,w);
            right=right+w;
        }
        while(left<right){
            int mid=(left+right)/2;
            int requireddays=1,currentload=0;
            for(int w:weights){
                if(currentload+w>mid){
                    requireddays++;
                    currentload=0;
                }
                currentload=currentload+w;
            }
            if(requireddays>days){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
}