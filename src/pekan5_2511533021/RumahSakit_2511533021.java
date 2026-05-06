package pekan5_2511533021;

import java.util.Scanner;

public class RumahSakit_2511533021 {
    static Pasien_2511533021 head_3021 = null;
    static int counter_3021 = 0;

    // INSERT (Daftarkan Pasien)
    public static void insertPasien_3021(String nama_3021, String penyakit_3021) {
        counter_3021++;
        Pasien_2511533021 pasienBaru_3021 = new Pasien_2511533021(nama_3021, penyakit_3021, counter_3021);

        if (head_3021 == null) {
            head_3021 = pasienBaru_3021;
        } else {
            Pasien_2511533021 temp_3021 = head_3021;
            while (temp_3021.getNext_3021() != null) {
                temp_3021 = temp_3021.getNext_3021();
            }
            temp_3021.setNext_3021(pasienBaru_3021);
        }

        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_3021);
    }

    // DELETE HEAD (Panggil Pasien)
    public static void deleteHead_3021() {
        if (head_3021 == null) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Memanggil Pasien:");
            System.out.println("Nama: " + head_3021.getNamaPasien_3021());
            System.out.println("Keluhan: " + head_3021.getPenyakit_3021());
            System.out.println("Nomor Antrian: " + head_3021.getNomorAntrian_3021());

            head_3021 = head_3021.getNext_3021();
        }
    }

    // DISPLAY
    public static void display_3021() {
        if (head_3021 == null) {
            System.out.println("Antrian kosong!");
        } else {
            Pasien_2511533021 temp_3021 = head_3021;
            while (temp_3021 != null) {
                System.out.println("No: " + temp_3021.getNomorAntrian_3021() +
                        " | Nama: " + temp_3021.getNamaPasien_3021() +
                        " | Keluhan: " + temp_3021.getPenyakit_3021());
                temp_3021 = temp_3021.getNext_3021();
            }
        }
    }

    // SEARCH (Case Insensitive)
    public static void search_3021(String nama_3021) {
        Pasien_2511533021 temp_3021 = head_3021;
        boolean ditemukan_3021 = false;

        while (temp_3021 != null) {
            if (temp_3021.getNamaPasien_3021().equalsIgnoreCase(nama_3021)) {
                System.out.println("Pasien ditemukan!");
                System.out.println("Nama: " + temp_3021.getNamaPasien_3021());
                System.out.println("Keluhan: " + temp_3021.getPenyakit_3021());
                System.out.println("Nomor Antrian: " + temp_3021.getNomorAntrian_3021());
                ditemukan_3021 = true;
                break;
            }
            temp_3021 = temp_3021.getNext_3021();
        }

        if (!ditemukan_3021) {
            System.out.println("Pasien tidak ditemukan!");
        }
    }

    // CEK STATUS
    public static void cekStatus_3021() {
        if (head_3021 == null) {
            System.out.println("Antrian kosong!");
        } else {
            int jumlah_3021 = 0;
            Pasien_2511533021 temp_3021 = head_3021;

            while (temp_3021 != null) {
                jumlah_3021++;
                temp_3021 = temp_3021.getNext_3021();
            }

            System.out.println("Jumlah pasien: " + jumlah_3021);
            System.out.println("Pasien terdepan:");
            System.out.println("Nama: " + head_3021.getNamaPasien_3021());
            System.out.println("Keluhan: " + head_3021.getPenyakit_3021());
        }
    }

    // MAIN MENU
    public static void main(String[] args) {
        Scanner input_3021 = new Scanner(System.in);
        int pilihan_3021;

        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511533021 ===");
            System.out.println("1. Daftarkan Pasien");
            System.out.println("2. Panggil Pasien");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Cari Pasien");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_3021 = input_3021.nextInt();
            input_3021.nextLine();

            switch (pilihan_3021) {
                case 1:
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama_3021 = input_3021.nextLine();
                    System.out.print("Masukkan Keluhan: ");
                    String penyakit_3021 = input_3021.nextLine();
                    insertPasien_3021(nama_3021, penyakit_3021);
                    break;

                case 2:
                    deleteHead_3021();
                    break;

                case 3:
                    display_3021();
                    break;

                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari_3021 = input_3021.nextLine();
                    search_3021(cari_3021);
                    break;

                case 5:
                    cekStatus_3021();
                    break;

                case 6:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_3021 != 6);
    }
}