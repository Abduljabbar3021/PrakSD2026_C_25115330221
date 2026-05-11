package pekan6_2511533021;

public class InsertDLL_2511533021 {

    static NodeDLL_2511533021 insertBegin(NodeDLL_2511533021 head, int data) {

        NodeDLL_2511533021 new_node = new NodeDLL_2511533021(data);

        new_node.next_3021 = head;

        if (head != null) {
            head.prev_3021 = new_node;
        }

        return new_node;
    }

    public static NodeDLL_2511533021 insertEnd(NodeDLL_2511533021 head, int newData) {

        NodeDLL_2511533021 newNode = new NodeDLL_2511533021(newData);

        if (head == null) {
            head = newNode;
        } else {

            NodeDLL_2511533021 curr = head;

            while (curr.next_3021 != null) {
                curr = curr.next_3021;
            }

            curr.next_3021 = newNode;
            newNode.prev_3021 = curr;
        }

        return head;
    }

    public static NodeDLL_2511533021 insertAtPosition(NodeDLL_2511533021 head, int pos, int new_data) {

        NodeDLL_2511533021 new_node = new NodeDLL_2511533021(new_data);

        if (pos == 1) {

            new_node.next_3021 = head;

            if (head != null) {
                head.prev_3021 = new_node;
            }

            head = new_node;
            return head;
        }

        NodeDLL_2511533021 curr = head;

        for (int i = 1; i < pos - 1 && curr != null; ++i) {
            curr = curr.next_3021;
        }

        if (curr == null) {
            System.out.println("posisi tidak ada");
            return head;
        }

        new_node.prev_3021 = curr;
        new_node.next_3021 = curr.next_3021;
        curr.next_3021 = new_node;

        if (new_node.next_3021 != null) {
            new_node.next_3021.prev_3021 = new_node;
        }

        return head;
    }

    public static void printList(NodeDLL_2511533021 head) {

        NodeDLL_2511533021 curr = head;

        while (curr != null) {
            System.out.print(curr.data_3021 + "<->");
            curr = curr.next_3021;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        NodeDLL_2511533021 head = new NodeDLL_2511533021(2);

        head.next_3021 = new NodeDLL_2511533021(3);
        head.next_3021.prev_3021 = head;

        head.next_3021.next_3021 = new NodeDLL_2511533021(5);
        head.next_3021.next_3021.prev_3021 = head.next_3021;

        System.out.println("DLL Awal: ");
        printList(head);

        head = insertBegin(head, 1);

        System.out.print("simpul 1 di tambah di awal : ");
        printList(head);

        System.out.print("simpul 6 di tambah di akhir: ");

        int data = 6;
        head = insertEnd(head, data);

        printList(head);

        System.out.println("tambah node 4 di posisi 4: ");

        int data2 = 4;
        int pos = 4;

        head = insertAtPosition(head, pos, data2);

        printList(head);
    }
}