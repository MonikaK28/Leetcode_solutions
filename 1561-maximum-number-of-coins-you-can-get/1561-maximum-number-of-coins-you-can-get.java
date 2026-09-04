class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length;
        int l=0,r=n-2,ans=0;
        while(l<r){
            ans=ans+piles[r];
            r=r-2;
            l++;
        }
        return ans;
    }
}