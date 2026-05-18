package pekan7_2511533021;

public class SelectionSort_2511533021 {

	public static void selectionSort_3021(int[] arr_3021) {
		int n_3021 = arr_3021.length;
		for (int i =0; i<n_3021; i++) {
			int minindex = i;
			for (int j = i + 1; j<n_3021; j++) {
				if (arr_3021[j]< arr_3021[minindex]) {
					minindex= j;
				}
			}
			int temp = arr_3021 [i];
			arr_3021[i]= arr_3021 [minindex];
			arr_3021 [minindex]= temp;
		}

	}
	public static void main (String []args) {
		int arr_3021[]= {23, 78, 45, 8, 32, 56, 1};
		int n_3021 = arr_3021.length;

		System.out.printf("array yang belum terurut:\n");

		for (int i_3021 = 0; i_3021 < n_3021; i_3021++)
			System.out.print(arr_3021[i_3021] + " ");

		System.out.println("");

		selectionSort_3021(arr_3021);

		System.out.println("array terurut:\n");

		for (int i_3021 = 0; i_3021 < n_3021; i_3021++)
			System.out.print(arr_3021[i_3021] + " ");

		System.out.println(" ");
}}
