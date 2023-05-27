/**
 * @author Marlon Bair - 5/26/23
 * 
 * Given the root of a binary tree, return the sum of all left leaves.
 *
 * A leaf is a node with no children. 
 * A left leaf is a leaf that is the left child of another node.
 *
 */

public class SumOfLeftLeaves {

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

    public int sumOfLeftLeaves(TreeNode root) {
        
        // Sum is empty if root is null or has no children
        if(root == null || isLeaf(root)) { return 0;}

        return getSum(root);

    }

    /**
     * Recursive function to get sum of left nodes
     * @param node -> Input node
     * @return Sum of left node values from node
     */
    private int getSum(TreeNode node) {

        // Return node value if leaf
        if(isLeaf(node)) {
            return node.val;
        }

        
        if(node.left != null && node.right != null && !isLeaf(node.right)) {
            return getSum(node.left) + getSum(node.right);    // If both left and right nodes are traversable (right must not be leaf)
        } else if(node.left == null && node.right != null && !isLeaf(node.right)) {
            return getSum(node.right);                       // If only right is traversable
        } else if(node.left == null) {                      
            return 0;                                        // If left nor right are traversable
        } else {
            return getSum(node.left);                       // If only left is traversable
        }
    }

    /**
     * Helper function for determining if node is a leaf
     * @param node -> Input node
     * @return True if node is leaf, false if not
     */
    private boolean isLeaf(TreeNode node) {
        return node.left == null & node.right == null;
    }
}

