/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
/**
 * DiameterOfBinaryTree.java
 * Purpose: Find the diameter of Binary Tree
 *
 * @author Megha Rastogi
 * @version 1.0 08/03/2020
 */
class DiameterOfBinaryTree {
    // ans variable to track diameter
    int ans = 0;
    
    /**
     * Find the diameter of Binary Tree
     *
     * @param root, TreeNode
     * @return integer, diameter
     */
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        depth(root);
        return ans-1;
    }
    
    /**
     * Helper method to find the diameter of a binary tree
     *
     * @param root, TreeNode
     * @return integer, diameter
     */
    public int depth(TreeNode root){
        // return 0 when reaching leaf nodes
        if(root == null)
            return 0;
        
        // left node depth
        int left = depth(root.left);
     
        // right node depth
        int right = depth(root.right);
     
        // update diameter with the max diameter till now
        ans = Math.max(ans, left+right+1);
     
        //return depth till this node
        return Math.max(left, right)+1;
    }
}
