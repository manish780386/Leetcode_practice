import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BalancedBinaryTree0110 {

    public static int height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);

        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = height(root.right);

        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    public static TreeNode buildTree(Scanner sc, int n) {

        if (n == 0) {
            return null;
        }

        TreeNode root = new TreeNode(sc.nextInt());

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int count = 1;

        while (!queue.isEmpty() && count < n) {

            TreeNode current = queue.poll();

            int leftVal = sc.nextInt();
            count++;

            if (leftVal != -1) {
                current.left = new TreeNode(leftVal);
                queue.add(current.left);
            }

            if (count < n) {

                int rightVal = sc.nextInt();
                count++;

                if (rightVal != -1) {
                    current.right = new TreeNode(rightVal);
                    queue.add(current.right);
                }
            }
        }

        return root;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter tree values (-1 for null):");

        TreeNode root = buildTree(sc, n);

        boolean result = isBalanced(root);

        System.out.println("Is Balanced Tree? " + result);

        sc.close();
    }
}