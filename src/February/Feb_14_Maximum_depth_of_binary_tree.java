package February;

class TreeNode {
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



public class Feb_14_Maximum_depth_of_binary_tree {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        else
        {
            // Computing the depth of each subtree
            int ldepth = maxDepth(root.left);
            int rdepth = maxDepth(root.right);
            if(ldepth > rdepth)
                return ldepth+1;
            else
                return rdepth+1;
        }
    }
}
