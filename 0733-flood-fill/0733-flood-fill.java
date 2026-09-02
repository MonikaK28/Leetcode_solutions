class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcolor,newcolor;
        oldcolor=image[sr][sc];
        newcolor=color;
        if(oldcolor==newcolor)return image;
        dfs(image,sr,sc,oldcolor,newcolor);
        return image;
    }
        private void dfs(int image[][],int i,int j,int oldcolor,int newcolor){
            int n=image.length;
            int m=image[0].length;
        if(i<0||j<0||i>=image.length||j>=image[0].length)return;
            if(image[i][j]!=oldcolor){
            return;
        }
        image[i][j]=newcolor;
        dfs(image,i+1,j,oldcolor,newcolor);//down in row
        dfs(image,i-1,j,oldcolor,newcolor);//above
        dfs(image,i,j+1,oldcolor,newcolor);//right in column
        dfs(image,i,j-1,oldcolor,newcolor);// left in column
    }
}