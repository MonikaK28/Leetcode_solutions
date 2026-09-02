class Solution {
    int oldcolor,newcolor;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        oldcolor=image[sr][sc];
        newcolor=color;
        if(oldcolor==newcolor)return image;
        dfs(image,sr,sc);
        return image;
    }
        private void dfs(int image[][],int i,int j){
            int n=image.length;// for row
            int m=image[0].length;// for column
            if(i<0||j<0||i>=n||j>=m||image[i][j]!=oldcolor)return;

            image[i][j]=newcolor;
            // dfs traversal
            dfs(image,i+1,j);//down in row
            dfs(image,i-1,j);//above
            dfs(image,i,j+1);//right in column
            dfs(image,i,j-1);// left in column
    }
}