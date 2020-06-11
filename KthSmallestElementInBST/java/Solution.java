class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list.get(k-1);
    }
    
    private List<Integer> dfs(TreeNode node, List<Integer> list) {
        if (node == null) {
            return list;
        }
        dfs(node.left, list).add(node.val);
        return dfs(node.right, list);
    }
}
