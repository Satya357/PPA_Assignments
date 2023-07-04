class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Construct_binary_tree_04 {
    private static int index;

    public static TreeNode constructBinaryTree(String s) {
        if (s.isEmpty()) {
            return null;
        }

        index = 0;
        return constructTree(s);
    }

    private static TreeNode constructTree(String s) {
        if (index >= s.length()) {
            return null;
        }

        int endIndex = index;
        while (endIndex < s.length() && s.charAt(endIndex) != '(' && s.charAt(endIndex) != ')') {
            endIndex++;
        }

        int val = Integer.parseInt(s.substring(index, endIndex));
        TreeNode node = new TreeNode(val);

        if (endIndex < s.length() && s.charAt(endIndex) == '(') {
            index = endIndex + 1;
            node.left = constructTree(s);
        }

        if (endIndex < s.length() && s.charAt(endIndex) == ')' && node.left == null) {
            index = endIndex + 1;
        }

        if (endIndex < s.length() && s.charAt(endIndex) == '(') {
            index = endIndex + 1;
            node.right = constructTree(s);
        }

        if (endIndex < s.length() && s.charAt(endIndex) == ')' && node.right == null) {
            index = endIndex + 1;
        }

        return node;
    }

    public static void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void main(String[] args) {
        String s = "4(2(3)(1))(6(5))";

        TreeNode root = constructBinaryTree(s);

        preorderTraversal(root);
    }
}
