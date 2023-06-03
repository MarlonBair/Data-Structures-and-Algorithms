/**
 * @author Marlon Bair 6/3/23
 * 
 * Given the root of a binary tree, return the bottom-up level order traversal of its nodes' values. 
 * (i.e., from left to right, level by level from leaf to root).
 */

import java.util.*;

public class TreeLevelOrderTraversalII {
    
  // Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public List<List<Integer>> levelOrder(TreeNode root) {
        
        // LinkedList is most efficient as new level will be added at head
        List<List<Integer>> list = new LinkedList<>();

        if(root == null) { return list; }

        // Utilize queue to perform a BFS
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        // Using a BFS, add each sublevel of tree to total list
        while(!q.isEmpty()) {
            List<Integer> currentLevel = new ArrayList<Integer>();

            int levelSize = q.size();                               
            for(int i = 0; i < levelSize; i++) {

                if(q.peek().left != null) { q.add(q.peek().left); }

                if(q.peek().right != null) { q.add(q.peek().right); }

                currentLevel.add(q.remove().val);
            }

            // Add each level at head of list for reverse order
            list.add(0, currentLevel);

        }

        return list;
        
    }
}

