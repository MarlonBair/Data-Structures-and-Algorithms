/** 
* @author Marlon Bair - 4/28/23
*
* Given a m x n binary matrix mat, find the 0-indexed position of the row that contains the maximum count of ones, and the number of ones in that row.
*
* In case there are multiple rows that have the maximum count of ones, the row with the smallest row number should be selected.
*
* Return an array containing the index of the row, and the number of ones in it.
*/

public class MaxOnes {

    /**
     * @param mat - Input matrix
     * Determine row in matrix with highest number of ones
     * @return result array containing {row index, one count in row index} 
    */
    public int[] rowAndMaximumOnes(int[][] mat) {

        // Row index with most ones index and one count of said row
        int maxRow = -1;
        int maxOnes = -1;

        // Iterate through matrix, updating row index and one count if applicable
        for(int i=0;i<mat.length;i++){
            int ones = 0;            
            for(int j=0; j<mat[0].length; j++) {
                if(mat[i][j] == 1) { ones++; }
            }

            if(ones > maxOnes) {
                maxOnes = ones;
                maxRow = i;
            }
        }

        int[] result = {maxRow, maxOnes};

        return result;
    }
}