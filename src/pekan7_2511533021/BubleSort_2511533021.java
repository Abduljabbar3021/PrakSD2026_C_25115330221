package pekan7_2511533021;

public class BubleSort_2511533021 {

	public static void BubleSort_3021(int[] arr_3021) {

		int n_3021 = arr_3021.length;

		for (int i_3021 = 0; i_3021 < n_3021; i_3021++) {

			for (int j_3021 = 0; j_3021 < n_3021 - i_3021 - 1; j_3021++) {

				if (arr_3021[j_3021] > arr_3021[j_3021 + 1]) {

					int temp_3021 = arr_3021[j_3021];
					arr_3021[j_3021] = arr_3021[j_3021 + 1];
					arr_3021[j_3021 + 1] = temp_3021;
				}
			}
		}
	}

	public static void main(String[] args) {

		int arr_3021[] = {23, 78, 45, 8, 32, 56, 1};

		int n_3021 = arr_3021.length;

		System.out.print("array yang belum terurut: ");

		for (int i_3021 = 0; i_3021 < n_3021; i_3021++)
			System.out.print(arr_3021[i_3021] + " ");

		System.out.println("");

		BubleSort_3021(arr_3021);

		System.out.println("array yang terurut menggunakan BubleSort:");

		for (int i_3021 = 0; i_3021 < n_3021; i_3021++)
			System.out.print(arr_3021[i_3021] + " ");

		System.out.println(" ");
	}
}