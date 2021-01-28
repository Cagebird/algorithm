package hard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author takaibun
 */
public class TreeTraversal {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return list;
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return list;
    }

    private void preorder(TreeNode root) {
        if(root==null){
            return;
        }
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    
    public List<Integer> postorder(Node root) {
        traversal(root);
        return list;

    }
    public void traversal(Node root){
        if(root==null){
            return;
        }
        for(Node node:root.children){
            traversal(node);
        }
        list.add(root.val);
    }

}
