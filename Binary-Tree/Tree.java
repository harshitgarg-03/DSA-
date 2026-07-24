
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

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

        public static Node LevelTRaversalBuildTree(int[] arr) {

            if (arr.length == 0 || arr[0] == -1)
                return null;

            Node root = new Node(arr[0]);

            Queue<Node> q = new LinkedList<>();
            q.offer(root);

            int idx = 1;

            while (!q.isEmpty() && idx < arr.length) {

                Node curr = q.poll();

                // Left child
                if (idx < arr.length) {
                    if (arr[idx] != -1) {
                        curr.left = new Node(arr[idx]);
                        q.offer(curr.left);
                    }
                    idx++;
                }

                // Right child
                if (idx < arr.length) {
                    if (arr[idx] != -1) {
                        curr.right = new Node(arr[idx]);
                        q.offer(curr.right);
                    }
                    idx++;
                }
            }

            return root;
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

        public static int Count_Leaves(Node root) {
            if (root == null) {
                return 0;
            }

            int lh = Count_Leaves(root.left);
            int rh = Count_Leaves(root.right);
            int sum = lh + rh;

            if (root.left == null && root.right == null) {
                System.out.println("leave node is " + root.data);
                sum = sum + 1;
            }
            return sum;
        }

        public static int Diameter(Node root) {
            if (root == null) {
                return 0;
            }

            int left = Diameter(root.left);
            int right = Diameter(root.right);

            int height = heigth(root.left) + 1 + heigth(root.right);

            int max_diameter = Math.max(left, Math.max(right, height));

            return max_diameter;
        }

        public static ArrayList<Integer> ZigZag_TRaversal(Node root) {
            ArrayList<Integer> list = new ArrayList<>();

            if (root == null) {
                return list;
            }

            int level = 0;
            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {

                int size = q.size();

                ArrayList<Integer> temp = new ArrayList<>();

                for (int i = 0; i < size; i++) {

                    Node newNode = q.remove();

                    if (level % 2 == 0) {
                        temp.add(newNode.data);
                    } else {
                        temp.add(0, newNode.data);
                    }

                    if (newNode.left != null) {
                        q.add(newNode.left);
                    }

                    if (newNode.right != null) {
                        q.add(newNode.right);
                    }
                }

                list.addAll(temp);
                level++;
            }

            System.out.println("list is :: " + list);

            return list;
        }

        public static ArrayList<Integer> Left_Traversal(Node root, ArrayList<Integer> list) {
            if (root == null || (root.left == null && root.right == null)) {
                return list;
            }

            list.add(root.data);
            if (root.left != null) {
                Left_Traversal(root.left, list);
            } else {
                Left_Traversal(root.right, list);
            }

            return list;
        }

        public static ArrayList<Integer> Leaves_Traversal(Node root, ArrayList<Integer> list) {
            if (root == null) {
                return list;
            }

            if (root.left == null && root.right == null) {
                list.add(root.data);
                return list;
            }

            if (root.left != null) {
                Leaves_Traversal(root.left, list);
            }
            if (root.right != null) {
                Leaves_Traversal(root.right, list);
            }

            return list;

        }

        public static ArrayList<Integer> right_Traversal(Node root, ArrayList<Integer> list) {
            if (root == null || (root.left == null && root.right == null)) {
                return list;
            }

            if (root.right != null) {
                right_Traversal(root.right, list);
            } else if (root.left != null) {
                right_Traversal(root.left, list);
            }

            list.add(root.data);

            return list;
        }

        public static ArrayList<Integer> Boundary_Traversal(Node root) {
            ArrayList<Integer> list = new ArrayList<>();

            list.add(root.data);
            if (root == null || (root.left == null && root.right == null)) {
                return list;
            }

            ArrayList<Integer> leftList = new ArrayList<>();
            ArrayList<Integer> leaves_List = new ArrayList<>();
            ArrayList<Integer> right_List = new ArrayList<>();
            leftList = Left_Traversal(root.left, leftList);
            leaves_List = Leaves_Traversal(root, leaves_List);
            right_List = right_Traversal(root.right, right_List);
            list.addAll(leftList);
            list.addAll(leaves_List);
            // right_List.removeLast();
            list.addAll(right_List);

            System.out.println("left subtree is :: " + leftList);
            System.out.println("right subtree is :: " + right_List);
            System.out.println("leaf subtree is :: " + leaves_List);
            return list;
        }
        
        static class Info{
            Node root;
            int ht;
            int data;

            Info(Node root, int hd, int data) {
                this.root = root;
                this.ht = hd;
                this.data = data;
            }
        }

        public static ArrayList<Integer> TopOfView(Node root){

            ArrayList<Integer> list = new ArrayList<>();

            Queue<Info> q = new LinkedList<>();
            q.add(new Info(root, 0, root.data));
            TreeMap<Integer, Integer> hash = new TreeMap<>();

            while(!q.isEmpty()){
                Info curr = q.remove();

                Node currNode = curr.root;

                if(hash.get(curr.ht) == null){
                    hash.put(curr.ht, currNode.data);
                }


                if(currNode.left != null){
                    q.add(new Info(currNode.left, curr.ht-1, currNode.left.data));
                }

                if(currNode.right != null){
                    q.add(new Info(currNode.right, curr.ht+1, currNode.right.data));
                }
            }


            list.addAll(hash.values());
            System.out.println(list);

            return list;
        }
    
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, -1, -1, 8, 9, -1, -1, -1, -1 };

        // int arr[] = { 1, -1, 2, -1, 3, -1, 4, -1, -1 };

        int arr[] = { 6, 3, 4, -1, 2, 9, 3, -1, 9 };
        // int arr[] = { 1, -1, -1 };
        // int arr[] = {1, 2, -1, 4, 5, -1, 6, -1, -1, 7, 8, -1, -1, -1, -1};

        BinaryTree tree = new BinaryTree();

        // Node returnNode = tree.preOrderBinary(arr);

        Node returNode = tree.LevelTRaversalBuildTree(arr);

        // tree.LevelTraversal(returNode);

        // HashMap<Integer, Integer> hash = new HashMap<>();
         ArrayList<Integer> list =  tree.TopOfView(returNode);

        // TreeMap<Integer, Integer> sortedHash = new TreeMap<>(hash);


        // System.out.println(sortedHash);

        // Node returnNode = tree.LevelTRaversalBuildTree(arr);
        // tree.preOrderTraversal(returnNode);
        // System.out.println(returnNode.data);

        // System.out.println(tree.Count_Leaves(returnNode));

        // System.out.println(tree.Diameter(returnNode));
        // System.out.println(tree.ZigZag_TRaversal(returnNode));
        // System.out.println("level traversal is :: ");
        // tree.LevelTraversal(returnNode);
        // System.out.println("boundayr traversal is :: " + tree.Boundary_Traversal(returnNode));
        // System.out.println("boundayr traversal is :: " +
        // tree.Count_Leaves(returnNode));

        // System.out.println("leaf count is :: " + count);

        // Node returnNode = tree.LevelTRaversalBuildTree(arr);

        // tree.preOrderTraversal(returnNode);
        // tree.InOrderTraversal(returnNode);
        // tree.preOrderTraversal(returnNode);
        // System.out.println(tree.Count_Sum_Nodes(returnNode));
    }
}
