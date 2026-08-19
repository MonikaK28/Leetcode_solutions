class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int a=x;
        int r=0;
        while(x!=0){
            int digit=x%10;
            r=r*10+digit;
            x=x/10;
        }
        return a==r;

    }
}