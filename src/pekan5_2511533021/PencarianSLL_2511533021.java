package pekan5_2511533021;

public class PencarianSLL_2511533021 {

    static boolean searchKey(NodeSLL_2511533021 head_3021, int key_3021) {
        NodeSLL_2511533021 curr_3021 = head_3021;

        while (curr_3021 != null) {
            if (curr_3021.data_3021 == key_3021)
                return true;

            curr_3021 = curr_3021.next_3021;
        }

        return false;
    }

    public static void traversal(NodeSLL_2511533021 head_3021) {
        NodeSLL_2511533021 curr_3021 = head_3021;

        while (curr_3021 != null) {
            System.out.print(" " + curr_3021.data_3021);
            curr_3021 = curr_3021.next_3021;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        NodeSLL_2511533021 head_3021 = new NodeSLL_2511533021(14);
        head_3021.next_3021 = new NodeSLL_2511533021(21);
        head_3021.next_3021.next_3021 = new NodeSLL_2511533021(13);
        head_3021.next_3021.next_3021.next_3021 = new NodeSLL_2511533021(30);
        head_3021.next_3021.next_3021.next_3021.next_3021 = new NodeSLL_2511533021(10);

        System.out.print("Penelusuran SLL : ");
        traversal(head_3021);

        int key_3021 = 30;
        System.out.print("cari data " + key_3021 + " = ");

        if (searchKey(head_3021, key_3021))
            System.out.println("ketemu");
        else
            System.out.println("tidak ada");
    }
}