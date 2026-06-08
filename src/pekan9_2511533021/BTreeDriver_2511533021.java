package pekan9_2511533021;

public class BTreeDriver_2511533021 {
    public static void main(String[] args) {
        // membuat pohon
        BTree_2511533021 tree_3021 = new BTree_2511533021();

        System.out.print("Jumlah Simpul awal pohon: ");
        System.out.println(tree_3021.countNodes_3021());

        // menambahkan simpul data 1
        Node_2511533021 root_3021 = new Node_2511533021(1);

        // menjadikan simpul 1 sebagai root
        tree_3021.setRoot_3021(root_3021);

        System.out.println("Jumlah simpul jika hanya ada root");
        System.out.println(tree_3021.countNodes_3021());

        Node_2511533021 node2_3021 = new Node_2511533021(2);
        Node_2511533021 node3_3021 = new Node_2511533021(3);
        Node_2511533021 node4_3021 = new Node_2511533021(4);
        Node_2511533021 node5_3021 = new Node_2511533021(5);
        Node_2511533021 node6_3021 = new Node_2511533021(6);
        Node_2511533021 node7_3021 = new Node_2511533021(7);
        Node_2511533021 node8_3021 = new Node_2511533021(8);
        Node_2511533021 node9_3021 = new Node_2511533021(9);

        root_3021.setLeft_3021(node2_3021);
        node2_3021.setLeft_3021(node4_3021);
        node2_3021.setRight_3021(node5_3021);
        node4_3021.setRight_3021(node8_3021);

        root_3021.setRight_3021(node3_3021);
        node3_3021.setLeft_3021(node6_3021);
        node3_3021.setRight_3021(node7_3021);
        node6_3021.setLeft_3021(node9_3021);

        // set root
        tree_3021.setCurrent_3021(tree_3021.getRoot_3021());

        System.out.println("menampilkan simpul terakhir:");
        System.out.println(tree_3021.getCurrent_3021().getData_3021());

        System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
        System.out.println(tree_3021.countNodes_3021());

        System.out.println("InOrder: ");
        tree_3021.printInorder_3021();

        System.out.println("\nPreorder: ");
        tree_3021.printInorder_3021();

        System.out.println("\nPostorder: ");
        tree_3021.printPostOrder_3021();

        System.out.println("\nMenampilkan simpul dalam bentuk pohon");
        tree_3021.print_3021();
    }
}