public class TreeNode {
    private String name;
    private int val;
    private TreeNode left;
    private TreeNode right;
    public TreeNode(String name,int x){
        this.name = name;
        this.val = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "name='" + name + '\'' +
                ", val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
