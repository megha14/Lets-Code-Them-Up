/**
 * MaxDepthBinaryTree.java
 * Purpose: Find maximum depth of Binary Tree
 *
 * @author Megha Rastogi
 * @version 1.0 1/30/2020
 */
class MaxDepthBinaryTree {

    /**
     * Bottom up approach to return maximum depth of binary tree
     *
     * @param root, TreeNode
     * @return integer, depth
     */
    public int maxDepthBottomUp(TreeNode root) {
        
        // return 0 if the root is null
        if(root == null)
            return 0;
        
        // finding depth of both left and right subtree of root
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        // return the maximum of depth of left and right subtree
        return Math.max(left,right)+1;
    }
    
    // global variable to store max depth of tree
    int answer = 0;
    
    /**
     * Top down approach to return maximum depth of binary tree
     *
     * @param root, TreeNode
     * @return integer, depth
     */
    public int maxDepth(TreeNode root) {
    
        // call the helper method to find max depth
        depth(root, 1);
        
        // return max depth
        return answer;
    }
    
    /**
     * Helper method to find bottom up approach to return maximum depth of binary tree
     *
     * @param root, TreeNode
     * @param depth, integer
     */
    public void depth(TreeNode root, int depth){
        
        // return if the root is null
        if(root == null)
            return;
        
        // make answer maximum of answer and depth
        // when we reach leaf node
        if(root.left == null && root.right == null)
            answer = Math.max(answer, depth);
        
        // Find the depth of left and right subtree
        depth(root.left, depth+1);
        depth(root.right, depth+1);
    }
    
}
