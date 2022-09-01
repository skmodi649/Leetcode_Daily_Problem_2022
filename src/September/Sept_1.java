package September;

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

public class Sept_1 {
    public int goodNodes(TreeNode1 root) {

        if(root == null) return 0;
        return count(root, root.val);
    }

    private int count(TreeNode1 node, int max){

        if(node == null) return 0;

        max = Math.max(node.val, max); // max node value in current path
        int left = count(node.left, max); // count all good nodes in left
        int right = count(node.right, max); // count all good nodes in right

        int res = left + right;
        if(node.val >= max) res++; // if current node is good, add that in res

        return res;
    }
}
