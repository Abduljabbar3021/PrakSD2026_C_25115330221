package pekan9_2511533021;

public class BTree_2511533021 {
    private Node_2511533021 root_3021;
    private Node_2511533021 currentNode_3021;

    public BTree_2511533021() {
        root_3021 = null;
    }

    public boolean search_3021(int data_3021) {
        return search_3021(root_3021, data_3021);
    }

    private boolean search_3021(Node_2511533021 node_3021, int data_3021) {
        if (node_3021.getData_3021() == data_3021)
            return true;

        if (node_3021.getLeft_3021() != null)
            if (search_3021(node_3021.getLeft_3021(), data_3021))
                return true;

        if (node_3021.getRight_3021() != null)
            if (search_3021(node_3021.getRight_3021(), data_3021))
                return true;

        return false;
    }

    public void printInorder_3021() {
        root_3021.printInorder_3021(root_3021);
    }

    public void printPreOrder_3021() {
        root_3021.printPostorder_3021(root_3021);
    }

    public void printPostOrder_3021() {
        root_3021.printPostorder_3021(root_3021);
    }

    public Node_2511533021 getRoot_3021() {
        return root_3021;
    }

    public boolean isEmpty_3021() {
        return root_3021 == null;
    }

    public int countNodes_3021() {
        return countNodes_3021(root_3021);
    }

    private int countNodes_3021(Node_2511533021 node_3021) {
        int count_3021 = 1;

        if (node_3021 == null) {
            return 0;
        } else {
            count_3021 += countNodes_3021(node_3021.getLeft_3021());
            count_3021 += countNodes_3021(node_3021.getRight_3021());
            return count_3021;
        }
    }

    public void print_3021() {
        root_3021.print_3021();
    }

    public Node_2511533021 getCurrent_3021() {
        return currentNode_3021;
    }

    public void setCurrent_3021(Node_2511533021 node_3021) {
        this.currentNode_3021 = node_3021;
    }

    public void setRoot_3021(Node_2511533021 root_3021) {
        this.root_3021 = root_3021;
    }
}