package Tree;

/**
 * Created by Wie Hsing Li on 1/1/2017.
 */
public class BST {
    public static Node root;

    /**
     * instantiate root node
     */
    public BST() {
        this.root = null;
    }

    /**
     * if root.data is greater than n, we need to go left of root
     * if root.data is less than n, we need to go right of the root
     * if any point of time root.data is equal to n, we have found the node, return true
     * if we reach to the leaves (end of the tree) return false, we didn't find the element
     *
     * @param id - desired element to be found
     * @return boolean if element has been found
     */
//    public boolean find(int id) {
//        Node current = root;
//        while (current != null) {
//            if (current.data == id) {
//                return true;
//            } else if (current.data > id) { //data great than n, go left node
//                current = current.Left;
//            } else {
//                current = current.Right;  // data less than n, go right node
//            }
//        }
//        return false;
//    }
    public boolean find(int id) {
        Node current = root;
        if (findNode(id, current)) {
            System.out.println("Found it!");
            return true;
        } else {
            return false;
        }
    }

    public boolean findNode(int id, Node current) {
        System.out.println();
        System.out.println("Current: " + current.data + "\tTarget: " + id);
        if (current.data > id) findNode(id, current.Left);
        else if (current.data < id) findNode(id, current.Right);
        if(current.data == id){
            System.out.println("Target Found!");
            return true;
        }
        else{
            System.out.println("Target Not found");
            return false;
        }
    }

    /**
     * Inserting a node, find the place to insert the node.
     * current = root
     * start from the current and compare root.data with n
     * if current.data is greater than n, go left of the root
     * if current.data is less than n, go right of the root
     * if current is null that means we have reached to the leaf,
     * insert new node.
     * @param id - desired element to be inserting
     */
    public void insert(int id) {
        Node newNode = new Node(id);

        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;
        while (true) {
            parent = current;
            if (id < current.data) {
                current = current.Left; //traversing left of root
                if (current == null) {
                    parent.Left = newNode; //if left of root = null insert new node here
                    return;
                } //end if
            } else {
                current = current.Right; //traversing right of root
                if (current == null) {
                    parent.Right = newNode; //if right of root = null insert new node here
                    return;
                }
            } //end else
        } // end while
    }

    /**
     *  deals with 3 cases
     *  node to be deleted is a leaf
     *  node to be deleted has only one child
     *  node to be deleted has two children
     * @param id
     * @return
     */
    public boolean delete(int id) {

        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;

        //Traversing tree to find element
        while (current.data != id) {
            parent = current;
            if (current.data > id) {
                isLeftChild = true;
                current = current.Left;
            } else {
                isLeftChild = false;
                current = current.Right;
            }
            if (current == null) {
                return false;
            }
        }
        /**
         * Case 1: Node deleted has no children
         * Keep track of parent node and side in which the node exist(left or right)
         * set parent.Left = null or parent.Right = null
         */
        if (current.Left == null && current.Right == null) {
            if (current == root) {
                root = null;
            }
            if (isLeftChild == true) {
                parent.Left = null;
            } else {
                parent.Right = null;
            }
        }
        /**
         * Case 2: Node deleted has one child
         * traverse to that node, keep track of parent node and the side in which the node exist (left or right)
         * check which side child is null (since it has only 1 child)
         * eg. Node deleted has child on its left side.  Take the entire sub tree from the left side
         * and add it to the parent and the side on which deleteNode exist.
         */
        else if (current.Right == null) {
            if (current == root) {
                root = current.Left;
            } else if (isLeftChild) {
                parent.Left = current.Left;
            } else {
                parent.Right = current.Left;
            }
        } else if (current.Left == null) {
            if (current == root) {
                root = current.Right;
            } else if (isLeftChild) {
                parent.Left = current.Right;
            } else {
                parent.Right = current.Right;
            }
        }
        /**
         * Case 3: Node deleted has 2 children
         * Find Successor to replace the deleted node.
         * Successor is the smaller node in the right sub tree of the node to be deleted
         *
         */
        else if (current.Left != null && current.Right != null) {

            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.Left = successor;
            } else {
                parent.Right = successor;
            }
            successor.Left = current.Left;
        }
        return true;
    }

    public Node getSuccessor(Node deleteNode) {
        Node successor = null;
        Node successorParent = null;
        Node current = deleteNode.Right;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.Left;
        }
        /**
         * Check if successor has the right child, it cannot have left child
         * if it does have the right child, add it to the left successorParent
         */
        if (successor != deleteNode.Right) {
            successorParent.Left = successor.Right;
            successor.Right = deleteNode.Right;
        }
        return successor;
    }


    public void display(Node root) {
        if (root != null) {
            display(root.Left);
            System.out.print(" " + root.data);
            display(root.Right);
        }
    }
}
