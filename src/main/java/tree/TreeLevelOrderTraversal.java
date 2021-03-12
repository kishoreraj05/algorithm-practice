/**
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[9,20],[15,7]]
 *
 *Example 2:
 * Input: root = [1]
 * Output: [[1]]
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 2000].
 * -1000 <= Node.val <= 1000
 */
package tree;
import java.util.*;

public class TreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        q.add(new TreeNode(-2000));
        List<Integer> list = new ArrayList<>();

        while(!q.isEmpty()) {
            TreeNode node = q.remove();
            if (node.val == -2000){
                result.add(list);
                list = new ArrayList<Integer>();
                if (!q.isEmpty()){
                    q.add(new TreeNode(-2000));
                }
            }else {
                list.add(node.val);
                if (node.left != null){
                    q.add(node.left);
                }
                if (node.right != null){
                    q.add(node.right);
                }
            }
        }
        return result;
    }
}
