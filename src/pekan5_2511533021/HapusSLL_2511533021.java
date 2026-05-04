package pekan5_2511533021;

public class HapusSLL_2511533021 {

    // fungsi untuk menghapus head
    public static NodeSLL_2511533021 deleteHead(NodeSLL_2511533021 head_3021) {
        if (head_3021 == null)
            return null;

        head_3021 = head_3021.next_3021;
        return head_3021;
    }

    // fungsi menghapus node terakhir SLL
    public static NodeSLL_2511533021 removeLastNode(NodeSLL_2511533021 head_3021) {
        if (head_3021 == null) {
            return null;
        }

        if (head_3021.next_3021 == null) {
            return null;
        }

        NodeSLL_2511533021 secondLast_3021 = head_3021;

        while (secondLast_3021.next_3021.next_3021 != null) {
            secondLast_3021 = secondLast_3021.next_3021;
        }

        secondLast_3021.next_3021 = null;
        return head_3021;
    }

    // fungsi menghapus node di posisi tertentu
    public static NodeSLL_2511533021 deleteNode(NodeSLL_2511533021 head_3021, int position_3021) {
        NodeSLL_2511533021 temp_3021 = head_3021;
        NodeSLL_2511533021 prev_3021 = null;

        if (temp_3021 == null)
            return head_3021;

        if (position_3021 == 1) {
            head_3021 = temp_3021.next_3021;
            return head_3021;
        }

        for (int i = 1; temp_3021 != null && i < position_3021; i++) {
            prev_3021 = temp_3021;
            temp_3021 = temp_3021.next_3021;
        }

        if (temp_3021 != null) {
            prev_3021.next_3021 = temp_3021.next_3021;
        } else {
            System.out.println("Data tidak ada");
        }

        return head_3021;
    }

    // fungsi mencetak SLL
    public static void printList(NodeSLL_2511533021 head_3021) {
        NodeSLL_2511533021 curr_3021 = head_3021;

        while (curr_3021 != null) {
            if (curr_3021.next_3021 != null) {
                System.out.print(curr_3021.data_3021 + "-->");
            } else {
                System.out.print(curr_3021.data_3021);
            }
            curr_3021 = curr_3021.next_3021;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6
        NodeSLL_2511533021 head_3021 = new NodeSLL_2511533021(1);
        head_3021.next_3021 = new NodeSLL_2511533021(2);
        head_3021.next_3021.next_3021 = new NodeSLL_2511533021(3);
        head_3021.next_3021.next_3021.next_3021 = new NodeSLL_2511533021(4);
        head_3021.next_3021.next_3021.next_3021.next_3021 = new NodeSLL_2511533021(5);
        head_3021.next_3021.next_3021.next_3021.next_3021.next_3021 = new NodeSLL_2511533021(6);

        System.out.println("List awal:");
        printList(head_3021);

        // hapus head
        head_3021 = deleteHead(head_3021);
        System.out.println("List setelah head dihapus:");
        printList(head_3021);

        // hapus node terakhir
        head_3021 = removeLastNode(head_3021);
        System.out.println("List setelah simpul terakhir dihapus:");
        printList(head_3021);

        // hapus posisi ke-2
        int position_3021 = 2;
        head_3021 = deleteNode(head_3021, position_3021);
        System.out.println("List setelah posisi 2 dihapus:");
        printList(head_3021);
    }
}