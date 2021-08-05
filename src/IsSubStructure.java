public class IsSubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B==null) {
            return false;
        }
        return isThisTree(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);

    }

    private boolean isThisTree(TreeNode a, TreeNode b) {
        if (b == null) {
            return true;
        }
        if (a == null|| a.val != b.val){
            return  false;
        }
        return  isThisTree(a.left,b.left)&& isThisTree(a.right,b.right);
    }
}
