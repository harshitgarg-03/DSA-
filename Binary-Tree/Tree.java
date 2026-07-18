
import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        static int idx = -1;

        static int ht = 0;

        static int sum = 0;

        public static Node LevelTRaversalBuildTree(int arr[]) {

            idx++;
            if (arr[idx] == -1 || arr.length == 0) {
                return null;
            }

            Node newNode = new Node(arr[idx]);

            Queue<Node> q = new LinkedList<>();

            q.add(newNode);

            while (!q.isEmpty() && idx++ < arr.length) {
                Node CurrNode = q.remove();

                // left
                if (idx < arr.length && arr[idx] != -1) {
                    CurrNode.left = new Node(arr[idx++]);
                    q.add(CurrNode.left);
                }

                // right
                if (idx < arr.length && arr[idx] != -1) {
                    CurrNode.right = new Node(arr[idx++]);
                    q.add(CurrNode.right);
                }

            }
            return newNode;
        }

        public static Node preOrderBinary(int arr[]) {
            idx++;
            if (arr[idx] == -1) {
                return null;
            }

            Node newNode = new Node(arr[idx]);
            newNode.left = preOrderBinary(arr);
            newNode.right = preOrderBinary(arr);

            return newNode;
        }

        public static void preOrderTraversal(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }

            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        public static void InOrderTraversal(Node left) {
            if (left == null) {
                return;
            }
            Node root = left;
            InOrderTraversal(root.left);
            System.out.print(root.data + " ");
            InOrderTraversal(root.right);
        }

        public static void PostOrderTraversal(Node left) {
            if (left == null) {
                return;
            }
            Node root = left;
            InOrderTraversal(root.left);
            InOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }

        public static void LevelTraversal(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node CurrNode = q.remove();

                if (CurrNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(CurrNode.data + " ");
                    if (CurrNode.left != null) {
                        q.add(CurrNode.left);
                    }
                    if (CurrNode.right != null) {
                        q.add(CurrNode.right);
                    }

                }
            }
        }

        public static int heigth(Node root) {
            if (root == null) {
                return 0;
            }

            int lh = heigth(root.left);
            int rh = heigth(root.right);
            int max_ht = Math.max(lh, rh) + 1;
            return max_ht;
        }

        public static int Count_Nodes(Node root) {
            if (root == null) {
                return 0;
            }

            int lh = Count_Nodes(root.left);
            int rh = Count_Nodes(root.right);

            int totalNOdes = lh + rh + 1;

            return totalNOdes;
        }

        public static int Count_Sum_Nodes(Node root) {
            if (root == null) {
                return 0;
            }

            int lh = Count_Sum_Nodes(root.left);
            int rh = Count_Sum_Nodes(root.right);

            return lh + rh + root.data;
        }

    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        int arr[] = {1, 2, -1, 4, 5, -1, 6, -1, -1, 7, 8};

        BinaryTree tree = new BinaryTree();

        // Node returnNode = tree.preOrderBinary(arr);

        Node returnNode = tree.LevelTRaversalBuildTree(arr);

        // tree.preOrderTraversal(returnNode);
        // tree.InOrderTraversal(returnNode);
        tree.LevelTraversal(returnNode);
        // System.out.println(tree.Count_Sum_Nodes(returnNode));
    }
}
