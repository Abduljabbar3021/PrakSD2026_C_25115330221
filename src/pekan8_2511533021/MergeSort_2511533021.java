package pekan8_2511533021;

public class MergeSort_2511533021 {

    void merge_3021(int arr_3021[], int l_3021, int m_3021, int r_3021) {

        // Find sizes of two subarrays to be merged
        int n1_3021 = m_3021 - l_3021 + 1;
        int n2_3021 = r_3021 - m_3021;

        /* Create temp arrays */
        int L_3021[] = new int[n1_3021];
        int R_3021[] = new int[n2_3021];

        /* Copy data to temp arrays */
        for (int i_3021 = 0; i_3021 < n1_3021; ++i_3021)
            L_3021[i_3021] = arr_3021[l_3021 + i_3021];

        for (int j_3021 = 0; j_3021 < n2_3021; ++j_3021)
            R_3021[j_3021] = arr_3021[m_3021 + 1 + j_3021];

        int i_3021 = 0, j_3021 = 0;

        // Initial index of merged subarray array
        int k_3021 = l_3021;

        while (i_3021 < n1_3021 && j_3021 < n2_3021) {

            if (L_3021[i_3021] <= R_3021[j_3021]) {
                arr_3021[k_3021] = L_3021[i_3021];
                i_3021++;
            } else {
                arr_3021[k_3021] = R_3021[j_3021];
                j_3021++;
            }

            k_3021++;
        }

        /* Copy remaining elements of L[] if any */
        while (i_3021 < n1_3021) {
            arr_3021[k_3021] = L_3021[i_3021];
            i_3021++;
            k_3021++;
        }

        /* Copy remaining elements of R[] if any */
        while (j_3021 < n2_3021) {
            arr_3021[k_3021] = R_3021[j_3021];
            j_3021++;
            k_3021++;
        }
    }

    void sort(int arr_3021[], int l_3021, int r_3021) {

        if (l_3021 < r_3021) {

            // Find the middle point
            int m_3021 = (l_3021 + r_3021) / 2;

            // Sort first and second halves
            sort(arr_3021, l_3021, m_3021);
            sort(arr_3021, m_3021 + 1, r_3021);

            // Merge the sorted halves
            merge_3021(arr_3021, l_3021, m_3021, r_3021);
        }
    }

    
    static void printArray(int arr_3021[]) {

        int n_3021 = arr_3021.length;

        for (int i_3021 = 0; i_3021 < n_3021; ++i_3021)
            System.out.print(arr_3021[i_3021] + " ");

        System.out.println();
    }

    public static void main(String args_3021[]) {

        int arr_3021[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Sebelum terurut");
        printArray(arr_3021);

        MergeSort_2511533021 ob_3021 = new MergeSort_2511533021();

        ob_3021.sort(arr_3021, 0, arr_3021.length - 1);

        System.out.println("\nSesudah Terurut menggunakan Merge Sort");
        printArray(arr_3021);
    }
}