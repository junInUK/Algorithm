import java.util.LinkedList;
import java.util.List;

public class Knight {

    static class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        public String toString(){
            return "x=" + this.x + "y=" + this.y;
        }
    }

    static class TreeNode{
        Point p;
        TreeNode left;
        TreeNode right;
        public TreeNode(Point p){
            this.p = p;
            left = null;
            right = null;
        }

        public String toString(){
            return this.p.toString();
        }
    }

    public static void main(String args[]){
        Point start = new Point(0,0);
        System.out.println(start.toString());
        TreeNode root = new TreeNode(start);
        System.out.println(root.toString());

        List<TreeNode> nodeList = new LinkedList<TreeNode>();
        nodeList.add(root);


    }

}
