package pekan3_2511533021;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511533021 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Stack untuk menyimpan objek Website
        Stack<Website_2511533021> history_3021 = new Stack<>();

        int pilihan;

        do {
            System.out.println("\n=== Browser History NIM: 2511533021 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {

                case 1:
                    // PUSH
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan URL: ");
                    String url = input.nextLine();

                    Website_2511533021 web = new Website_2511533021(judul, url);
                    history_3021.push(web);

                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    // POP
                    if (!history_3021.isEmpty()) {
                        Website_2511533021 hapus = history_3021.pop();
                        System.out.println("Halaman dihapus: " + hapus.getJudul_3021());
                    } else {
                        System.out.println("History kosong! Tidak bisa back.");
                    }
                    break;

                case 3:
                    // PEEK
                    if (!history_3021.isEmpty()) {
                        Website_2511533021 current = history_3021.peek();
                        System.out.println("Halaman Aktif:");
                        System.out.println("Judul: " + current.getJudul_3021());
                        System.out.println("URL: " + current.getUrl_3021());
                    } else {
                        System.out.println("Tidak ada halaman aktif.");
                    }
                    break;

                case 4:
                    // STATUS
                    if (history_3021.isEmpty()) {
                        System.out.println("History kosong.");
                    } else {
                        System.out.println("Jumlah history: " + history_3021.size());
                    }
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);

        input.close();
    }
}