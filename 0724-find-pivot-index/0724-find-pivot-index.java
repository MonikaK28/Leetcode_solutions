class Solution {
    public int pivotIndex(int[] arr) {
        int sumLeft=0,sumRight=0;
        for(int i=0;i<arr.length;i++){
            sumRight=sumRight+arr[i];}
        for(int i=0;i<arr.length;i++){
            sumRight=sumRight-arr[i];
            if(sumLeft==sumRight){
                return i;
            }
            else{
                sumLeft=sumLeft+arr[i];
            }
        }
       return -1; 
    }
}