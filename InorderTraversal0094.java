import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class InorderTraversal0094 {

    public static void inorder(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }

        inorder(root.left, result);

        result.add(root.val);

        inorder(root.right, result);
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

        List<Integer> result = new ArrayList<>();

        inorder(root, result);

        System.out.println("Inorder Traversal:");

        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}