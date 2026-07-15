
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

        public static void preOrderTraversal(Node root){
            if(root == null){
                System.out.print(-1 + " ");
                return;
            }

            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        public static void InOrderTraversal(Node left){
            if(left == null){
                return;
            }
            Node root = left;
            InOrderTraversal(root.left);
            System.out.print(root.data + " ");
            InOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();

        Node returnNode = tree.preOrderBinary(arr);

        // tree.preOrderTraversal(returnNode);
        tree.InOrderTraversal(returnNode);
        System.out.println();
    }
}
