class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(color != image[sr][sc])
        return recFunc(image,sr,sc,color);
        else return image;
    }
    public int[][] recFunc(int[][] image, int sr, int sc, int color) {
        int temp = image[sr][sc];
        image[sr][sc] = color;
        if(sr+1 < image.length)
        if(image[sr+1][sc] == temp )
           image = recFunc(image,sr+1,sc,color);
        if(sc+1 < image[0].length)
        if(image[sr][sc+1] == temp )
            image = recFunc(image,sr,sc+1,color);
        if(sc-1 > -1)
        if(image[sr][sc-1] == temp )
            image = recFunc(image,sr,sc-1,color);
        if(sr-1 > -1)
        if(image[sr-1][sc] == temp )
            image = recFunc(image,sr-1,sc,color);
        return image;
    }
}
