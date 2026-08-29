class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>st=new Stack<>();
        int n=temperatures.length;
        int dif[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int pindex=st.pop();
                dif[pindex]=i-pindex;
            }
            st.push(i);
        }
        return dif;
    }
}