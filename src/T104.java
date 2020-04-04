import javax.swing.tree.TreeNode;

/**
 * Created by asd on 2020/4/4 23:27.
 *
 * 二叉树的最大深度
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 *
 */
public class T104 {

    public static void main(String[] args) {
        TreeNode nodeRoot = new TreeNode(3);
        nodeRoot.left = new TreeNode(9);
        nodeRoot.right = new TreeNode(20);
        nodeRoot.right.left = new TreeNode(15);
        nodeRoot.right.right = new TreeNode(7);
        nodeRoot.right.right.left = new TreeNode(2);
        T104 t = new T104();
        System.out.println(t.maxDepth(nodeRoot));
    }

//    更简洁。。递归
//    public int maxDepth(TreeNode root) {
//        if(root == null)
//            return 0;
//
//        int left_height = maxDepth(root.left);
//        int right_height = maxDepth(root.right);
//        return Math.max(left_height, right_height) + 1;
//    }


    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int left = 0, right = 0;
        if (root.left != null) {
            left =  maxDepth(root.left) + 1;
        }
        if (root.right != null) {
            right =  maxDepth(root.right) + 1;
        }
        return left > right ? left : right;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }


}
