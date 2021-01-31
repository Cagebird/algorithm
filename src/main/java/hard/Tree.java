package hard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author takaibun
 */
public class Tree {
    /**
     * 二叉树数据结构
     */
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
    //设置一个数组存储遍历结果
    List<Integer> list = new ArrayList<Integer>();

    /**
     *二叉树的中序遍历
     */
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

    /**
     * 二叉树的前序遍历
     */
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

    /**
     * n叉树数据结构
     */
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

    /**
     * n叉树的后序遍历
     * n叉树的前序遍历相似，就不重复做了
     * */
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

    /**
     * 二叉树的最近公共祖先
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode treeLeft = lowestCommonAncestor(root.left, p, q);
        TreeNode treeRight = lowestCommonAncestor(root.right, p, q);
        if (treeLeft == null) {
            return treeRight;
        }
        if (treeRight == null) {
            return treeLeft;
        }
        return root;
    }
}
