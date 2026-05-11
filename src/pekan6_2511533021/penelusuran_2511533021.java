package pekan6_2511533021;

public class penelusuran_2511533021 {

    static void forwardTraversal(NodeDLL_2511533021 head) {

        NodeDLL_2511533021 curr_3021 = head;

        while (curr_3021 != null) {
            System.out.print(curr_3021.data_3021 + "<->");
            curr_3021 = curr_3021.next_3021;
        }

        System.out.println();
    }

    static void backwardTraversal(NodeDLL_2511533021 tail) {

        NodeDLL_2511533021 curr_3021 = tail;

        while (curr_3021 != null) {
            System.out.print(curr_3021.data_3021 + "<->");
            curr_3021 = curr_3021.prev_3021;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        NodeDLL_2511533021 head = new NodeDLL_2511533021(1);
        NodeDLL_2511533021 second = new NodeDLL_2511533021(2);
        NodeDLL_2511533021 third = new NodeDLL_2511533021(3);

        head.next_3021 = second;
        second.prev_3021 = head;

        second.next_3021 = third;
        third.prev_3021 = second;

        System.out.println("Penelusuran maju: ");
        forwardTraversal(head);

        System.out.println("Penelusuran mundur: ");
        backwardTraversal(third);
    }
}