package pekan8_2511533021;
import java.util.Scanner;

class Lagu {
    String judul;
    String penyanyi;
    int durasi;

    Lagu(String judul, String penyanyi, int durasi) {
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.durasi = durasi;
    }
}

public class Sorting_2511533021 {

    static Lagu[] dataLagu_3021 = new Lagu[20];
    static int jumlahData_3021 = 0;

    static void inputData_3021() {
        dataLagu_3021[0] = new Lagu("Mio Cristo Piange Diamanti", "Maneskin", 270);
        dataLagu_3021[1] = new Lagu("La Rumba Del Perdon", "Carlos Vives", 252);
        dataLagu_3021[2] = new Lagu("La Perla", "Calle 13", 196);
        dataLagu_3021[3] = new Lagu("Perfect", "Ed Sheeran", 263);
        dataLagu_3021[4] = new Lagu("Photograph", "Ed Sheeran", 258);
        dataLagu_3021[5] = new Lagu("Happier", "Olivia Rodrigo", 175);
        dataLagu_3021[6] = new Lagu("Believer", "Imagine Dragons", 204);

        jumlahData_3021 = 7;
    }

    static void tampilData_3021() {
        for (int i = 0; i < jumlahData_3021; i++) {
            System.out.println((i + 1) + ". "
                    + dataLagu_3021[i].judul + " - "
                    + dataLagu_3021[i].durasi + " detik");
        }
    }

    static void quickSort_3021(int low, int high) {
        if (low < high) {
            int pi = partition_3021(low, high);

            quickSort_3021(low, pi - 1);
            quickSort_3021(pi + 1, high);
        }
    }

    static int partition_3021(int low, int high) {
        int pivot = dataLagu_3021[high].durasi;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (dataLagu_3021[j].durasi < pivot) {
                i++;

                Lagu temp = dataLagu_3021[i];
                dataLagu_3021[i] = dataLagu_3021[j];
                dataLagu_3021[j] = temp;
            }
        }

        Lagu temp = dataLagu_3021[i + 1];
        dataLagu_3021[i + 1] = dataLagu_3021[high];
        dataLagu_3021[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        inputData_3021();

        System.out.println("=== Sorting Playlist NIM: 2511533021 ===");
        System.out.println("Pilih Algoritma (1=Shell, 2=Quick, 3=Merge): ");
        int pilihan = input.nextInt();

        System.out.println("\nData Sebelum Sorting:");
        tampilData_3021();

        if (pilihan == 2) {
            quickSort_3021(0, jumlahData_3021 - 1);

            System.out.println("\nData Setelah Quick Sort (Durasi Asc):");
            tampilData_3021();
        } else {
            System.out.println("\nTugas ini hanya mengimplementasikan Quick Sort.");
        }

        input.close();
    }
}