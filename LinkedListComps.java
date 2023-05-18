/**
 * @author Marlon Bair - 5/18/23
 * You are given the head of a linked list containing unique integer values and an integer array nums that is a subset of the linked list values.
 * 
 * Return the number of connected components in nums where two values are connected if they appear consecutively in the linked list.
 */


import java.util.HashSet;

public class LinkedListComps {
    
    // Definition for singly-linked list.
    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    
    class Solution {
        public int numComponents(ListNode head, int[] nums) {
            // Number of connected components
            int result = 0;

            // Keep track of streak of consecutive numbers
            boolean streak = false;

            // Store array values in HashSet for O(1) efficiency during contains
            HashSet<Integer> set = new HashSet<Integer>();
            for(int i=0; i< nums.length; i++) { set.add(nums[i]); }

            while(head != null) {

                // Start streak if node value is in input array
                if(set.contains(head.val)) { 
                    streak = true; 

                } else { 
                    // If streak is ongoing and node value isn't in array, end streak and increment result
                    if(streak) {
                        result++;
                        streak = false;
                    }
                }

                head = head.next;
            }

            // If ongoing streak when ended, increment result
            if(streak) { result++; }

            return result;
        }

    }
    
}
