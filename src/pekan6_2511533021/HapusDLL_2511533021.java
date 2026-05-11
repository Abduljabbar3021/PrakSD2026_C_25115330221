package pekan6_2511533021;

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
            System.out.print(curr.data_3021 + "<->");
            curr = curr.next_3021;
        }

        System.out.println();
    }
    public static void main (String[]args) {
    	NodeDLL_2511533021 head = new NodeDLL_2511533021(1);
    	heda.next = new NodeDLL(2);
    	head.next_3021.prev_3021 = head;
    	head.next_3021.next = new nodeDLL;
    	head.next_3021.prev_3021 = head;
    	head.next_3021.prev_3021 = head;
    	head.next_3021.prev_3021 = head;
    }
}