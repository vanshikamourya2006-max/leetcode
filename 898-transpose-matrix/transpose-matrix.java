
class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] ans = new int[column][row];
        int i=0;
        while(i < row) 
        {
            int j=0;
            while(j < column) {
                ans[j][i] = matrix[i][j];
                j++;
            }
            i++;
        }
        return ans;
    }
}