import apple.laf.JRSUIUtils;

import java.util.*;

public class BinaryTree {

    private TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    /**
     * non-recursion pre-order traversal
     */
    public List<TreeNode> preOrderNonRecursion(){
        List<TreeNode> resultList = new ArrayList<TreeNode>();
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        if(this.root == null)    //  return if the tree is empty
            return resultList;
        nodeStack.push(this.root);
        while(!nodeStack.isEmpty()){
            TreeNode tempNode = nodeStack.pop();
            resultList.add(tempNode);
            if(tempNode.getRight()!=null){
                nodeStack.push(tempNode.getRight());
            }
            if(tempNode.getLeft()!=null){
                nodeStack.push(tempNode.getLeft());
            }
        }
        return resultList;
    }

    /**
     * Non-recursion in-order traversal
     */
    public List<TreeNode> inOrderNonRecursion(){
        List<TreeNode> nodeList = new ArrayList<TreeNode>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = this.root;
        while(current!=null||!stack.empty()){
            while(current!=null){
                stack.push(current);
                current = current.getLeft();
            }
            current = stack.pop();
            nodeList.add(current);
            current = current.getRight();
        }
        return nodeList;
    }

    /**
     * Non-recursion post-order traversal
     */
    public List<TreeNode> postOrderNonRecursion() {
        List<TreeNode> nodeList = new ArrayList<TreeNode>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = this.root;
        TreeNode prev = null;
        if (current == null)
            return nodeList;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }
            current = stack.peek();
            if (current.getRight() == null || current.getRight() == nodeList.get(nodeList.size() - 1)) {
                nodeList.add(current);
                stack.pop();
                current = null;
            } else {
                current = current.getRight();
            }
        }
        return nodeList;
    }

}
