import java.util.Stack;

public class BinaryTree {
    TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public int maxDepth(TreeNode node){
        int leftDepth = 0;
        int rightDepth = 0;
        if(node!=null){
            leftDepth = maxDepth(node.left);
            rightDepth = maxDepth(node.right);
            return leftDepth>rightDepth ? leftDepth+1:rightDepth+1;
        }
        return 0;
    }

    public int maxDepthNonRecursion(TreeNode node){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = node;
        TreeNode prev = null;
        int maxDepth = 0;
        int currentDepth = 0;
        while(current!=null || !stack.isEmpty()){
            while(current!=null){
                stack.push(current);
                currentDepth ++;
                current = current.left;
            }
            current = stack.peek();
            if(current.right == null ||current.right == prev){
                if(currentDepth>maxDepth)
                    maxDepth = currentDepth;
                stack.pop();
                prev = current;
                current = null;
                currentDepth --;
            }else{
                current = current.right;
            }
        }
        return maxDepth;
    }

    public boolean isSymmetric(TreeNode node){
        if(node.left == null && node.right != null){
            return false;
        }else if(node.left == null && node.right == null){
            return true;
        }else if(node.left != null && node.right == null){
            return false;
        }else{
            if(node.left.val != node.right.val){
                return false;
            }else {
                if(!isSymmetric(node.left)||!isSymmetric(node.right)){
                    return false;
                }else{
                    return true;
                }
            }
        }
    }
}
