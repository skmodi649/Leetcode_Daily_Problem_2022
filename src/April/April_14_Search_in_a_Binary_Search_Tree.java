package April;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
       public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }


public class April_14_Search_in_a_Binary_Search_Tree {
    public TreeNode searchBST(TreeNode root, int val) {
        // Case where root is equal to null meaning we have reached the end of the tree traversal
        if(root == null){
            return null;
        }

        if(root.val == val){
            // Case where root value is equal to value searched, TreeNode found
            return root;
        }else if(root.val > val){
            // Case where the root value is greater than value searched, therefore we have to search on left side
            return searchBST(root.left, val);
        }else{
            // Case where the root value is smaller than value searched, therefore we have to search on right side
            return searchBST(root.right, val);
        }
    }
}
