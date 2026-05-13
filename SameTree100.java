import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class SameTree100 {

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }

    public static TreeNode buildTree(Scanner sc, int n) {

        if (n == 0) return null;

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

        System.out.print("Enter number of nodes for Tree 1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter Tree 1 values (-1 for null):");
        TreeNode tree1 = buildTree(sc, n1);

        System.out.print("Enter number of nodes for Tree 2: ");
        int n2 = sc.nextInt();

        System.out.println("Enter Tree 2 values (-1 for null):");
        TreeNode tree2 = buildTree(sc, n2);

        boolean result = isSameTree(tree1, tree2);

        System.out.println("Are both trees same? " + result);

        sc.close();
    }
}