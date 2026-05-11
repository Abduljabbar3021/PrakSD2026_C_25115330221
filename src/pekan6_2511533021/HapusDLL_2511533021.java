package pekan6_2511533021;

import pekan6_2511533021.NodeDLL_2511533021;

public class HapusDLL_2511533021 {

    public static NodeDLL_2511533021 delHead(NodeDLL_2511533021 head) {

        if (head == null) {
            return null;
        }

        NodeDLL_2511533021 temp = head;
        head = head.next_3021;

        if (head != null) {
            head.prev_3021 = null;
        }

        return head;
    }

    public static NodeDLL_2511533021 delLast(NodeDLL_2511533021 head) {

        if (head == null) {
            return null;
        }

        if (head.next_3021 == null) {
            return null;
        }

        NodeDLL_2511533021 curr = head;

        while (curr.next_3021 != null) {
            curr = curr.next_3021;
        }

        if (curr.prev_3021 != null) {
            curr.prev_3021.next_3021 = null;
        }

        return head;
    }

    public static NodeDLL_2511533021 delPos(NodeDLL_2511533021 head, int pos) {

        if (head == null) {
            return head;
        }

        NodeDLL_2511533021 curr = head;

        for (int i = 1; curr != null && i < pos; ++i) {
            curr = curr.next_3021;
        }

        if (curr == null) {
            return head;
        }

        if (curr.prev_3021 != null) {
            curr.prev_3021.next_3021 = curr.next_3021;
        }

        if (curr.next_3021 != null) {
            curr.next_3021.prev_3021 = curr.prev_3021;
        }

        if (head == curr) {
            head = curr.next_3021;
        }

        return head;
    }

    public static void printList(NodeDLL_2511533021 head) {

        NodeDLL_2511533021 curr = head;

        while (curr != null) {
            System.out.print(curr.data_3021 + " <-> ");
            curr = curr.next_3021;
        }

        System.out.println();
    }
    public static void main(String[] args) {
		//buat sebuah DLL
		NodeDLL_2511533021 head_3021 = new NodeDLL_2511533021(1);
		head_3021.next_3021 = new NodeDLL_2511533021(2);
		head_3021.next_3021.prev_3021 = head_3021;
		head_3021.next_3021.next_3021 = new NodeDLL_2511533021(3);
		head_3021.next_3021.next_3021.prev_3021 = head_3021.next_3021;
		head_3021.next_3021.next_3021.next_3021 = new NodeDLL_2511533021(4);
		head_3021.next_3021.next_3021.next_3021.prev_3021 = head_3021.next_3021.next_3021;
		head_3021.next_3021.next_3021.next_3021.next_3021 = new NodeDLL_2511533021(5);
		head_3021.next_3021.next_3021.next_3021.next_3021.prev_3021 = head_3021.next_3021.next_3021.next_3021;		
		System.out.print("DLL Awal : ");
		printList(head_3021);
		
		System.out.print("Setelah head dihapus : ");
		head_3021 = delHead(head_3021);
		printList(head_3021);
		
		System.out.print("Setelah node terakhir dihapus : ");
		head_3021 = delLast(head_3021);
		printList(head_3021);
		
		System.out.print("menghapus node ke 2 : ");
		head_3021 = delPos(head_3021, 2);
		printList(head_3021);
    }
}