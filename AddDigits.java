/**
 * @author - Marlon Bair 5/1/23
 * 
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 */

public class AddDigits {

    public int addDigits(int num) {
        
        // Base case 
        if(num / 10 == 0) { return num; }

        // Obtain sum of digits 
        int newNum = 0;
        String s = Integer.toString(num);

        for(int i = 0; i < s.length(); i++) { newNum += (int) s.charAt(i) - 48;}

        // Call function recursively using sum of digits
        return addDigits(newNum);
        
    }
}
