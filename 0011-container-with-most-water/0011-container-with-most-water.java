class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int maxwater=0;
        while(left<right){
            int distance=right-left;
            int h=Math.min(height[left],height[right]);
            int Q=distance*h;
            maxwater=Math.max(maxwater,Q);
            if(height[left]<height[right]){
                left++;
            }
            else{right--;}
        }
    return maxwater;
    }
}