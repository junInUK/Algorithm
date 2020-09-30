public class MaxDepthOfBinaryTree {
    public static void main(String args[]){
        TreeNode A = new TreeNode(3);
        TreeNode B = new TreeNode(9);
        TreeNode C = new TreeNode(20);
        TreeNode D = new TreeNode(15);
        TreeNode E = new TreeNode(7);
        A.left = B;
        A.right = C;
        C.left = D;
        C.right = E;
        BinaryTree bt1 = new BinaryTree(A);
        System.out.print(bt1.maxDepth(A));
        System.out.println();
        System.out.print(bt1.maxDepthNonRecursion(A));
        System.out.println(bt1.isSymmetric(A));
    }
}
