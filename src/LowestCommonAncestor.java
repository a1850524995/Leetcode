import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res = root;
        List<TreeNode> pPath = findPath(root,p);
        List<TreeNode> qPath = findPath(root,q);
        for (int i = 0;i < pPath.size() &&i < qPath.size();i++){
            if (pPath.get(i).val == qPath.get(i).val){
                res = pPath.get(i);
            }else {
                break;
            }
        }
        return res;

    }

    private List<TreeNode> findPath(TreeNode root, TreeNode target) {
        List<TreeNode> path = new ArrayList<>();
        if (root == null) {
            return path;
        }
        TreeNode node = root;
        while (node != null){
            if (node.val == target.val){
                path.add(node);
                break;

            }else if (node.val < target.val){
                path.add(node);
                node = node.right;
            }else {
                path.add(node);
                node = node.left;
            }
        }
        return path;

    }
}
