package LC30DayChallenge.day11;

import junit.framework.TestCase;

public class DiameterOfBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    static int sum = 0;

    public  int diameterOfBinaryTree (TreeNode root){
        d(root);
        return sum;
    }

    public  int d(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = d(root.left);

        int right = d(root.right);

        if (left + right > sum) sum = left + right;
        return 1 + Math.max(left, right);
    }


    public static class Test extends TestCase {

        public Test() {
            super();
        }

        @Override
        protected void setUp() throws Exception {
            super.setUp();
        }

        public TreeNode createNode(int data) {
            return new TreeNode(data);
        }

        public void test1() {
            DiameterOfBinaryTree obj = new DiameterOfBinaryTree();
            TreeNode root = createNode(1);
            root.left = createNode(2);
            root.left.left = createNode(3);
            root.right = createNode(4);
            root.right.right = createNode(5);
            root.left.right = createNode(6);
            root.left.right.right = createNode(7);
            root.right.right.right = createNode(8);
            assertEquals(6, obj.diameterOfBinaryTree(root));
        }
    }

}
