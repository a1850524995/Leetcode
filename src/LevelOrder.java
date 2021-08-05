import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null){
            return ret;
        }
        Queue<TreeNode> queue =  new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int curSize = queue.size();
            for (int i = 0; i < curSize;i++ ){
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if (cur.left != null){
                    queue.offer(cur.left);
                }
                if (cur.right != null){
                    queue.offer(cur.right);
                }

            }
            ret.add(list);
        }
        return ret;

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null){
            return ret;
        }
        Queue<TreeNode> queue =  new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int curSize = queue.size();
            for (int i = 0; i < curSize;i++ ){
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if (cur.left != null){
                    queue.offer(cur.left);
                }
                if (cur.right != null){
                    queue.offer(cur.right);
                }

            }
            ret.add(list);
        }
        return ret;

    }

}
