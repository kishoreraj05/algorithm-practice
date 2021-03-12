/**
 * Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).
 * Exp 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[20,9],[15,7]]
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 2000].
 * -100 <= Node.val <= 100
 */
package tree;
import java.util.*;
public class TreeZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        q.add(null);
        LinkedList<Integer> list = new LinkedList<>();
        boolean leftToRight = true;
        while(!q.isEmpty()) {
            TreeNode node = q.remove();
            if (node == null){
                result.add(list);
                list = new LinkedList<Integer>();
                if (!q.isEmpty()){
                    q.add(null);
                }
                leftToRight = (leftToRight)?false:true;
            }else {
                if (leftToRight == true)
                    list.addLast(node.val);
                else
                    list.addFirst(node.val);
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
