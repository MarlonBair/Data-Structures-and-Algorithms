/**
 * @author Marlon Bair - 5/31/23
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 */

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        // HashMap utilized for O(n) time complexity
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) { return new int[] {i, map.get(target - nums[i])}; }

            map.put(nums[i], i);
        }

        return null;

    }
}
