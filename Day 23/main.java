import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        inOrder(root, ans);
        return ans;
    }

    void inOrder(TreeNode node, List<Integer> list) {

        if(node == null) {
            return;
        }

        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }
}