package Tree;

/**
 * Created by Wie Hsing Li on 1/1/2017.
 */

public class Node {
    int data;
    Node Left;
    Node Right;

    /**
     * Constructor for Tree.Node.
     * Left and Right points to null indicating the end of the tree.
     * @param data
     */
    public Node(int data) {
        this.data = data;
        Left = null;
        Right = null;
    }
}
