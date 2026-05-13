// Kelas Musik 3021
package pekan6_2511533021;

import java.util.Scanner;

public class Musik_2511533021 {

    // head dan tail
    Lagu_2511533021 head_3021 = null;
    Lagu_2511533021 tail_3021 = null;

    Scanner input_3021 = new Scanner(System.in);

    // method tambah lagu di akhir
    public void tambahLagu_3021() {

        System.out.print("Masukkan Judul Lagu : ");
        String judul_3021 = input_3021.nextLine();

        System.out.print("Masukkan Penyanyi : ");
        String penyanyi_3021 = input_3021.nextLine();

        // membuat node baru
        Lagu_2511533021 laguBaru_3021 =
                new Lagu_2511533021(judul_3021, penyanyi_3021);

        // jika playlist kosong
        if (head_3021 == null) {
            head_3021 = laguBaru_3021;
            tail_3021 = laguBaru_3021;
        }

        // jika sudah ada isi
        else {
            tail_3021.next_3021 = laguBaru_3021;
            laguBaru_3021.prev_3021 = tail_3021;
            tail_3021 = laguBaru_3021;
        }

        System.out.println("Lagu berhasil ditambahkan!");
    }

    // method hapus lagu awal
    public void hapusLaguAwal_3021() {

        // jika kosong
        if (head_3021 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        // jika hanya 1 lagu
        if (head_3021 == tail_3021) {
            head_3021 = null;
            tail_3021 = null;
        }

        // jika lebih dari 1 lagu
        else {
            head_3021 = head_3021.next_3021;
            head_3021.prev_3021 = null;
        }

        System.out.println("Lagu pertama berhasil dihapus!");
    }

    // tampil playlist maju
    public void tampilMaju_3021() {

        // jika kosong
        if (head_3021 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2511533021 bantu_3021 = head_3021;

        System.out.println("\n=== Playlist Maju ===");

        while (bantu_3021 != null) {

            System.out.println("Judul    : "
                    + bantu_3021.judul_3021);

            System.out.println("Penyanyi : "
                    + bantu_3021.penyanyi_3021);

            System.out.println("---------------------");

            bantu_3021 = bantu_3021.next_3021;
        }
    }

    // tampil playlist mundur
    public void tampilMundur_3021() {

        // jika kosong
        if (tail_3021 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2511533021 bantu_3021 = tail_3021;

        System.out.println("\n=== Playlist Mundur ===");

        while (bantu_3021 != null) {

            System.out.println("Judul    : "
                    + bantu_3021.judul_3021);

            System.out.println("Penyanyi : "
                    + bantu_3021.penyanyi_3021);

            System.out.println("---------------------");

            bantu_3021 = bantu_3021.prev_3021;
        }
    }

    // cari lagu
    public void cariLagu_3021(String judulCari_3021) {

        // jika kosong
        if (head_3021 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2511533021 bantu_3021 = head_3021;

        boolean ketemu_3021 = false;

        while (bantu_3021 != null) {

            // pencarian tidak case sensitive
            if (bantu_3021.judul_3021
                    .equalsIgnoreCase(judulCari_3021)) {

                System.out.println("\nLagu ditemukan!");

                System.out.println("Judul    : "
                        + bantu_3021.judul_3021);

                System.out.println("Penyanyi : "
                        + bantu_3021.penyanyi_3021);

                ketemu_3021 = true;
                break;
            }

            bantu_3021 = bantu_3021.next_3021;
        }

        if (!ketemu_3021) {
            System.out.println("Lagu tidak ditemukan!");
        }
    }

    // method utama
    public static void main(String[] args) {

        Musik_2511533021 musik_3021 =
                new Musik_2511533021();

        Scanner input_3021 = new Scanner(System.in);

        int pilihan_3021;

        do {

            System.out.println("\n=== Playlist Musik NIM: 2511533021 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");

            System.out.print("Pilihan : ");
            pilihan_3021 = input_3021.nextInt();
            input_3021.nextLine();

            switch (pilihan_3021) {

                case 1:
                    musik_3021.tambahLagu_3021();
                    break;

                case 2:
                    musik_3021.hapusLaguAwal_3021();
                    break;

                case 3:
                    musik_3021.tampilMaju_3021();
                    break;

                case 4:
                    musik_3021.tampilMundur_3021();
                    break;

                case 5:

                    System.out.print("Masukkan Judul Lagu : ");
                    String judulCari_3021 =
                            input_3021.nextLine();

                    musik_3021.cariLagu_3021(judulCari_3021);

                    break;

                case 6:
                    System.out.println("Program selesai!");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan_3021 != 6);
    }
}