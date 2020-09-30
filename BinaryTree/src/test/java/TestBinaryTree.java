import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TestBinaryTree {

    BinaryTree bt1;

    @Before
    public void before(){
        TreeNode A = new TreeNode("A",1);
        TreeNode B = new TreeNode("B",2);
        TreeNode C = new TreeNode("C",3);
        TreeNode D = new TreeNode("D",3);
        TreeNode E = new TreeNode("E",6);
        TreeNode F = new TreeNode("F",3);
        TreeNode G = new TreeNode("G",1);
        TreeNode H = new TreeNode("H",2);
        TreeNode I = new TreeNode("I",5);
        TreeNode J = new TreeNode("J",6);

        A.setLeft(B);
        A.setRight(C);
        B.setLeft(D);
        B.setRight(E);
        D.setLeft(H);
        C.setLeft(F);
        C.setRight(G);
        G.setLeft(I);
        G.setRight(J);

        bt1 = new BinaryTree(A);
    }

    @Test
    public void canGetRoot(){
        System.out.println(bt1.getRoot().toString());
    }

    @Test
    public void canPreOrderNonRecursion(){
        List<TreeNode> nodeList = bt1.preOrderNonRecursion();
        for(TreeNode node: nodeList){
            System.out.print(node.getName() + node.getVal() + " ");
        }
    }

    @Test
    public void canInOrderNonRecursion(){
        List<TreeNode> nodeList = bt1.inOrderNonRecursion();
        for(TreeNode node: nodeList){
            System.out.print(node.getName() + node.getVal() + " ");
        }
    }

    @Test
    public void canPostOrderNonRecursion(){
        List<TreeNode> nodeList = bt1.postOrderNonRecursion();
        for(TreeNode node: nodeList){
            System.out.print(node.getName() + node.getVal() + " ");
        }
    }
}
