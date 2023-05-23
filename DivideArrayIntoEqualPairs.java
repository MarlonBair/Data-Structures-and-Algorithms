/**
 * @author - Marlon Bair 5/23/23
 * You are given an integer array nums consisting of 2 * n integers.
 * 
 * You need to divide nums into n pairs such that:
 * Each element belongs to exactly one pair.
 * The elements present in a pair are equal.
 * 
 * Return true if nums can be divided into n pairs, otherwise return false.
 */

import java.util.HashSet;

public class DivideArrayIntoEqualPairs {
    public boolean divideArray(int[] nums) {

        // Length of array must be even to be didvided into pairs
        if(nums.length % 2 != 0) { return false; }
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        // Add each array element to set, or remove if already exists
        for(int i = 0; i< nums.length; i++) {
            if(!set.add(nums[i])) {
                set.remove(nums[i]);
            } 
        }

        // If set is empty, then array may be divided into pairs
        return set.size() == 0;

    }
}
