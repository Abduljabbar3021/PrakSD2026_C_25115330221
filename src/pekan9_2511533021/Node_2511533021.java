package pekan9_2511533021;

public class Node_2511533021 {
    int data_3021;
    Node_2511533021 left_3021;
    Node_2511533021 right_3021;

    public Node_2511533021(int data_3021) {
        this.data_3021 = data_3021;
        left_3021 = null;
        right_3021 = null;
    }

    public void setLeft_3021(Node_2511533021 node_3021) {
        if (left_3021 == null)
            left_3021 = node_3021;
    }

    public void setRight_3021(Node_2511533021 node_3021) {
        if (right_3021 == null)
            right_3021 = node_3021;
    }

    public Node_2511533021 getLeft_3021() {
        return left_3021;
    }

    public Node_2511533021 getRight_3021() {
        return right_3021;
    }

    public int getData_3021() {
        return data_3021;
    }

    public void setData_3021() {
        this.data_3021 = data_3021;
    }

    void printPreorder_3021(Node_2511533021 node_3021) {
        if (node_3021 == null)
            return;

        System.out.println(node_3021.data_3021 + " ");
        printPreorder_3021(node_3021.left_3021);
        printPreorder_3021(node_3021.right_3021);
    }

    void printPostorder_3021(Node_2511533021 node_3021) {
        if (node_3021 == null)
            return;

        printPostorder_3021(node_3021.left_3021);
        printPostorder_3021(node_3021.right_3021);
        System.out.print(node_3021.data_3021 + " ");
    }

    void printInorder_3021(Node_2511533021 node_3021) {
        if (node_3021 == null)
            return;

        printInorder_3021(node_3021.left_3021);
        System.out.print(node_3021.data_3021 + " ");
        printInorder_3021(node_3021.right_3021);
    }

    public String print_3021() {
        return this.print_3021("", true, "");
    }

    public String print_3021(String prefix_3021, boolean isTail_3021, String sb_3021) {
        if (right_3021 != null) {
            right_3021.print_3021(
                prefix_3021 + (isTail_3021 ? "|  " : " "),
                false,
                sb_3021
            );
        }

        System.out.println(
            prefix_3021 + (isTail_3021 ? "\\--" : "/--") + data_3021
        );

        if (left_3021 != null) {
            left_3021.print_3021(
                prefix_3021 + (isTail_3021 ? " " : " | "),
                true,
                sb_3021
            );
        }

        return sb_3021;
    }
}