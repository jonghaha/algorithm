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
    }

    // 루트 노드.
    Node root = null;

    // 탐색 연산.
    public boolean find(char data) {
        Node current = root;

        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (current.data > data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    // 삭제 연산.
    public boolean remove(char data) {
        Node remove = root;
        Node parentOfRemove = null;

        while (remove.data != data) {
            parentOfRemove = remove;

            // 삭제할 값이 현재 노드보다 작으면 왼쪽을 탐색
            if (remove.data > data) {
                remove = remove.left;
            } else {
                remove = remove.right;
            }

            // 값을 비교하여 탐색했을 때 잎 노드(Leaf node)인 경우 삭제를 위한 탐색 실패
            if (remove == null) {
                return false;
            }
        }

        // 자식 노드가 모두 없을 때
        if (remove.left == null && remove.right == null) {
            // 삭제 대상이 루트일 때
            if (remove == root) {
                root = null;
            } else if (remove == parentOfRemove.right) {
                parentOfRemove.right = null;
            } else {
                parentOfRemove.left = null;
            }
        }
        // 오른쪽 자식 노드만 존재
        else if (remove.left == null) {
            if (remove == root) {
                root = remove.right;
            } else if (remove == parentOfRemove.right) {
                // 삭제 대상의 오른쪽 자식 노드를 삭제 대상 위치에 둠.
                parentOfRemove.right = remove.right;
            } else {
                parentOfRemove.left = remove.right;
            }
        }
        // 왼쪽 자식 노드만 존재
        else if (remove.right == null) {
            if (remove == root) {
                root = remove.left;
            } else if (remove == parentOfRemove.right) {
                parentOfRemove.right = remove.left;
            } else {
                // 삭제 대상의 왼쪽 자식을 삭제 대상 위치에 둠.
                parentOfRemove.left = remove.left;
            }
        }
        // 두 개의 자식 노드가 존재하는 경우
        // 삭제할 노드의 왼쪽 서브 트리에 있는 가장 큰 값 노드를 올리거나
        // 오른쪽 서브 트리에 있는 가장 작은 값 노드를 올리면 된다.
        // 구현 코드는 2번째 방법을 사용
        else {
            // 삭제 대상 노드의 자식 노드 중에서 대체될 노드를 찾는다.
            Node parentOfReplace = remove;

            // 삭제 대상의 오른쪽 서브 트리 탐색 지정
            Node replace = parentOfReplace.right;

            while (replace.left != null) {
                // 가장 작은 값을 찾기 위해 왼쪽 자식 노드를 탐색
                parentOfReplace = replace;
                replace = replace.left;
            }

            if (replace != remove.right) {
                // 가장 작은 값을 선택하기 때문에 대체 노드의 왼쪽 자식은 빈 노드가 된다.
                parentOfReplace.left = replace.right;

                // 대체할 노드의 오른쪽 자식 노드를 삭제할 노드의 오른쪽으로 지정
                replace.right = remove.right;
            }

            // 삭제할 노드가 루트 노드인 경우 대체할 노드로 바꿈
            if (remove == root) {
                root = replace;
            } else if (remove == parentOfRemove.right) {
                parentOfRemove.right = replace;
            } else {
                parentOfRemove.left = replace;
            }

            // 삭제 대상 노드의 왼쪽 자식을 잇는다
            replace.left = remove.left;
        }

        return true;
    }

    // 삽입 연산.
    public void insert(char data) {
        if (root == null) {
            root = new Node(data);
        } else {
            Node head = root;
            Node current;

            while (true) {
                current = head;

                if (head.data > data) {
                    head = head.left;

                    if(head == null) {
                        current.left = new Node(data);
                        break;
                    }
                } else {
                    head = head.right;

                    if (head == null) {
                        current.right = new Node(data);
                        break;
                    }
                }
            }
        }
    }

    // 중위 순회.
    public void inOrder(Node root, int depth) {
        if (root != null) {
            inOrder(root.left, depth + 1);
            for (int i = 0; i < depth; i++) {
                System.out.print("ㄴ");
            }
            System.out.println(root.data);
            inOrder(root.right, depth + 1);
        }
    }

    // 후위 순회.
    public void postOrder(Node root, int depth) {
        if (root != null) {
            postOrder(root.left, depth + 1);
            postOrder(root.right, depth + 1);
            for (int i = 0; i < depth; i++) {
                System.out.print("ㄴ");
            }
            System.out.println(root.data);
        }
    }

    // 전위 순회
    public void preOrder(Node root, int depth) {
        if (root != null) {
            for (int i = 0; i < depth; i++) {
                System.out.print("ㄴ");
            }
            System.out.println(root.data);
            preOrder(root.left, depth + 1);
            preOrder(root.right, depth + 1);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        b.insert('E');
        b.insert('B');
        b.insert('C');
        b.insert('A');
        b.insert('D');
        b.insert('I');
        b.insert('O');
        b.insert('P');

        b.inOrder(b.root, 0);
        //b.postOrder(b.root, 0);
        //b.preOrder(b.root, 0);
    }
}
