package pekan8_2511533021;

public class ShellSort_2511533021 {

	public static void shellSort_3021(int[] A_3021) {
		int n_3021 = A_3021.length;
		int gap_3021 = n_3021 / 2;

		while (gap_3021 > 0) {

			for (int i_3021 = gap_3021; i_3021 < n_3021; i_3021++) {

				int temp_3021 = A_3021[i_3021];
				int j_3021 = i_3021;

				while (j_3021 >= gap_3021 && A_3021[j_3021 - gap_3021] > temp_3021) {
					A_3021[j_3021] = A_3021[j_3021 - gap_3021];
					j_3021 = j_3021 - gap_3021;
				}

				A_3021[j_3021] = temp_3021;
			}

			gap_3021 = gap_3021 / 2;
		}
	}

	public static void main(String[] args) {

		int[] data_3021 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};

		System.out.print("Sebelum: ");
		printArray_3021(data_3021);

		shellSort_3021(data_3021);

		System.out.print("Sesudah (ShellSort): ");
		printArray_3021(data_3021);
	}

	public static void printArray_3021(int[] arr_3021) {

		for (int i_3021 : arr_3021)
			System.out.print(i_3021 + " ");

		System.out.println();
	}
}