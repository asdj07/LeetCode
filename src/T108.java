/**
 *
 * Created by asd on 2020/4/5 15:21.
 *
 * 108. 将有序数组转换为二叉搜索树
 * https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 *
 */
public class T108 {

    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = -10;
        nums[1] = -3;
        nums[2] = 0;
        nums[3] = 5;
        nums[4] = 9;
        T108 t = new T108();
        t.sortedArrayToBST(nums);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode root = treeNodeConverter(nums, 0, nums.length - 1);
        return root;
    }

    public TreeNode treeNodeConverter(int[] nums, int start, int end) {
        if(start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = treeNodeConverter(nums, start, mid - 1);
        node.right = treeNodeConverter(nums, mid + 1, end);
        return node;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }
}
