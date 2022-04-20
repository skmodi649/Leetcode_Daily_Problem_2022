package April;

import java.util.ArrayList;
import java.util.List;

class TreeNode1 {
      int val;
      TreeNode1 left;
      TreeNode1 right;
      TreeNode1() {}
      TreeNode1(int val) { this.val = val; }
      TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }




public class April_20_Binary_Search_Tree_Iterator {
    List<Integer> l= new ArrayList<>();
    int size=0,id=0;
    public void BSTIterator(TreeNode1 root) {

        helper(root);
        size=l.size();
    }
    //Inorder traversal
    void helper(TreeNode1 root){
        if(root==null)
            return;

        helper(root.left);
        l.add(root.val);
        helper(root.right);
    }
    public int next() {
        int ans=l.get(id);
        id++;
        return ans;
    }

    public boolean hasNext() {
        if(id>=size) return false;
        else return true;
    }
}
