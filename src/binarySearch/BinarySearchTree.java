package binarySearch;

public class BinarySearchTree {
    class Node {
        private char data;
        private Node left;
        private Node right;

        public Node(char value) {
            this.data = value;
            this.left = null;
            this.right = null;
        }

        public char getData() {
            return data;
        }
    }

    // 루트 노드.
    Node root = null;

    // 삽입 연산.
    public void insert(char id) {
        if (root == null) {
            root = new Node(id);
        } else {
            Node head = root;
            Node currentNode;

            while (true) {
                currentNode = head;

                if (head.data > id) {
                    head = head.left;

                    if(head == null) {
                        currentNode.left = new Node(id);
                        break;
                    }
                } else {
                    head = head.right;

                    if (head == null) {
                        currentNode.right = new Node(id);
                        break;
                    }
                }
            }
        }
    }

    public void display(Node root) {
        if(root != null) {
            display(root.left);
            System.out.print(" " + root.getData());
            display(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        b.insert('E');
        b.insert('B');
        b.insert('C');
        b.insert('A');

        b.display(b.root);
    }
}
