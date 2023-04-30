import java.util.ArrayList;
import java.util.List;

/**
 * @author Marlon Bair - 4/29/23
 * 
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * 
 */

public class PascalsTriangle {
    
    public List<List<Integer>> generate(int numRows) {

        // Total list of rows (Pascal's Triangle)
        List<List<Integer>> triangle = new ArrayList<>();

        // Create each row of Pascal's Triangle for numRows, and add to triangle
        for(int r = 0; r < numRows; r++) {

            ArrayList<Integer> newRow = new ArrayList<Integer>();
            
            // Each row begins with 1
            newRow.add(1);

            // Add the sum of the upper two numbers to each column in row
            for(int c = 1; c < r; c++) {
                newRow.add(triangle.get(r-1).get(c-1) + triangle.get(r-1).get(c));
            }
            
            // Add final 1 to row, with the exception of the first row
            if(r != 0) { newRow.add(1); }
            
            triangle.add(newRow);
        }

        return triangle;
    }
    
}
