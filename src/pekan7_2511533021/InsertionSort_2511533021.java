package pekan7_2511533021;

public class InsertionSort_2511533021 {

	public static void insertionSort_3021(int[] arr_3021) {
		int n_3021 = arr_3021.length;

		for (int i_3021 = 1; i_3021 < n_3021; i_3021++) {

			int key_3021 = arr_3021[i_3021];
			int j_3021 = i_3021 - 1;

			while (j_3021 >= 0 && arr_3021[j_3021] > key_3021) {
				arr_3021[j_3021 + 1] = arr_3021[j_3021];
				j_3021--;
			}
			arr_3021[j_3021 + 1] = key_3021;
		}
	}

	public static void main(String[] args) {

		int arr_3021[] = {23, 78, 45, 8, 32, 56, 1};

		int n_3021 = arr_3021.length;

		System.out.printf("array yang belum terurut:\n");

		for (int i_3021 = 0; i_3021 < n_3021; i_3021++)
			System.out.print(arr_3021[i_3021] + " ");

		System.out.println("");

		insertionSort_3021(arr_3021);

		System.out.println("array terurut:\n");

		for (int i_3021 = 0; i_3021 < n_3021; i_3021++)
			System.out.print(arr_3021[i_3021] + " ");

		System.out.println(" ");
	}
}