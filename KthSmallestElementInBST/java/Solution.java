class Solution {
    
    /**
    * Time complexity: O(n) n = number of nodes in BST
    * Space complexity: O(h) h = height of the Tree
    */
    private int inOrderIndex = 0;
    private int result = -1;
    
    public int kthSmallest(TreeNode root, int k) {
        return dfs(root, k);
    }
    
    private int dfs(TreeNode node, int k) {
        if (node == null) {
            return result;
        }
        dfs(node.left, k);
        if (++inOrderIndex == k) {
            result = node.val;
            return result;
        }
        return dfs(node.right, k);
    }
}
