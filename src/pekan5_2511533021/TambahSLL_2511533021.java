package pekan5_2511533021;

public class TambahSLL_2511533021 {

    public static NodeSLL_2511533021 insertAtFront(NodeSLL_2511533021 head_3021, int value_3021) {
        NodeSLL_2511533021 new_node_3021 = new NodeSLL_2511533021(value_3021);
        new_node_3021.next_3021 = head_3021;
        return new_node_3021;
    }

    // fungsi menambahkan node di akhir SLL
    public static NodeSLL_2511533021 insertAtEnd(NodeSLL_2511533021 head_3021, int value_3021) {
        NodeSLL_2511533021 newNode_3021 = new NodeSLL_2511533021(value_3021);

        if (head_3021 == null) {
            return newNode_3021;
        }

        NodeSLL_2511533021 last_3021 = head_3021;

        while (last_3021.next_3021 != null) {
            last_3021 = last_3021.next_3021;
        }

        last_3021.next_3021 = newNode_3021;
        return head_3021;
    }

    static NodeSLL_2511533021 GetNode_3021(int data_3021) {
        return new NodeSLL_2511533021(data_3021);
    }

    static NodeSLL_2511533021 insertPos(NodeSLL_2511533021 headNode_3021, int position_3021, int value_3021) {
        NodeSLL_2511533021 head_3021 = headNode_3021;

        if (position_3021 < 1)
            System.out.print("Invalid position");

        if (position_3021 == 1) {
            NodeSLL_2511533021 new_node_3021 = new NodeSLL_2511533021(value_3021);
            new_node_3021.next_3021 = head_3021;
            return new_node_3021;
        } else {
            while (position_3021-- != 0) {

                if (position_3021 == 1) {
                    NodeSLL_2511533021 newNode_3021 = GetNode_3021(value_3021);
                    newNode_3021.next_3021 = headNode_3021.next_3021;
                    headNode_3021.next_3021 = newNode_3021;
                    break;
                }

                headNode_3021 = headNode_3021.next_3021;
            }

            if (position_3021 != 1)
                System.out.print("Posisi di luar jangkauan");
        }

        return head_3021;
    }

    public static void printList(NodeSLL_2511533021 head_3021) {
        NodeSLL_2511533021 curr_3021 = head_3021;

        while (curr_3021.next_3021 != null) {
            System.out.print(curr_3021.data_3021 + "-->");
            curr_3021 = curr_3021.next_3021;
        }

        if (curr_3021.next_3021 == null) {
            System.out.print(curr_3021.data_3021);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // buat linked list 2->3->5->6
        NodeSLL_2511533021 head_3021 = new NodeSLL_2511533021(2);
        head_3021.next_3021 = new NodeSLL_2511533021(3);
        head_3021.next_3021.next_3021 = new NodeSLL_2511533021(5);
        head_3021.next_3021.next_3021.next_3021 = new NodeSLL_2511533021(6);

        // cetak list asli
        System.out.print("Senarai berantai awal: ");
        printList(head_3021);

        // tambah di depan
        System.out.print("tambah 1 simpul di depan: ");
        int data_3021 = 1;
        head_3021 = insertAtFront(head_3021, data_3021);
        printList(head_3021);

        // tambah di belakang
        System.out.print("tambah 1 simpul di belakang: ");
        int data2_3021 = 7;
        head_3021 = insertAtEnd(head_3021, data2_3021);
        printList(head_3021);

        // tambah di posisi tertentu
        System.out.print("tambah 1 simpul ke data 4: ");
        int data3_3021 = 4;
        int pos_3021 = 4;
        head_3021 = insertPos(head_3021, pos_3021, data3_3021);
        printList(head_3021);
    }
}