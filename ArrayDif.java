/**
 * @author Marlon Bair - 5/3/23
 * 
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 * 
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 * 
 * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * 
 */

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class ArrayDif {
   
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        result.add(new ArrayList<Integer>());

        // Add arrays into sets, then add different values into respective list
        for(int i: nums1) { set1.add(i); }
        for(int i: nums2) { set2.add(i); }

        for(int i: set1) { 
            if(!set2.contains(i)) { result.get(0).add(i); }
        }

        for(int i: set2) { 
            if(!set1.contains(i)) { result.get(1).add(i); }
        }

        return result;

    }

}
