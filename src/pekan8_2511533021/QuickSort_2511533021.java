package pekan8_2511533021;

public class QuickSort_2511533021 {

	// method swap
	static void swap_3021(int[] arr_3021, int i_3021, int j_3021) {

		int temp_3021 = arr_3021[i_3021];
		arr_3021[i_3021] = arr_3021[j_3021];
		arr_3021[j_3021] = temp_3021;
	}

	// method median of three
	static void medianOfThree_3021(int[] arr_3021,
			int low_3021,
			int high_3021) {

		int mid_3021 =
				low_3021 + (high_3021 - low_3021) / 2;

		if (arr_3021[low_3021] > arr_3021[mid_3021]) {

			swap_3021(arr_3021, low_3021, mid_3021);
		}

		if (arr_3021[low_3021] > arr_3021[high_3021]) {

			swap_3021(arr_3021, low_3021, high_3021);
		}

		if (arr_3021[mid_3021] > arr_3021[high_3021]) {

			swap_3021(arr_3021, mid_3021, high_3021);
		}

		swap_3021(arr_3021, mid_3021, high_3021);
	}

	// method partition
	static int partition_3021(int[] arr_3021,
			int low_3021,
			int high_3021) {

		medianOfThree_3021(
				arr_3021,
				low_3021,
				high_3021);

		int pivot_3021 = arr_3021[high_3021];

		int i_3021 = (low_3021 - 1);

		for (int j_3021 = low_3021;
				j_3021 <= high_3021 - 1;
				j_3021++) {

			if (arr_3021[j_3021] < pivot_3021) {

				i_3021++;

				swap_3021(
						arr_3021,
						i_3021,
						j_3021);
			}
		}

		swap_3021(
				arr_3021,
				i_3021 + 1,
				high_3021);

		return (i_3021 + 1);
	}

	// method quicksort
	static void quickSort_3021(int[] arr_3021,
			int low_3021,
			int high_3021) {

		if (low_3021 < high_3021) {

			int pi_3021 =
					partition_3021(
							arr_3021,
							low_3021,
							high_3021);

			quickSort_3021(
					arr_3021,
					low_3021,
					pi_3021 - 1);

			quickSort_3021(
					arr_3021,
					pi_3021 + 1,
					high_3021);
		}
	}

	// method print array
	public static void printArr_3021(int[] arr_3021) {

		for (int i_3021 = 0;
				i_3021 < arr_3021.length;
				i_3021++) {

			System.out.print(
					arr_3021[i_3021] + " ");
		}

		System.out.println();
	}

	// main method
	public static void main(String[] args) {

		int[] arr_3021 =
				{10, 7, 8, 9, 1, 5};

		int N_3021 = arr_3021.length;

		System.out.print(
				"Data sebelum diurutkan : ");

		printArr_3021(arr_3021);

		quickSort_3021(
				arr_3021,
				0,
				N_3021 - 1);

		System.out.print(
				"Data setelah Quick Sort : ");

		printArr_3021(arr_3021);
	}
}