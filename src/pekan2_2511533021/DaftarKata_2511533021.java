package pekan2_2511533021;
import java.util.ArrayList;

public class DaftarKata_2511533021 {

    private final ArrayList<String> data;

    // Konstruktor: inisialisasi list kosong
    public DaftarKata_2511533021() {
        this.data = new ArrayList<>();
    }

    // Menambahkan elemen di akhir list
    public void tambah(String elemen) {
        data.add(elemen);
    }

    // Menambahkan elemen pada indeks tertentu (menyisipkan)
    public void tambahPada(int index, String elemen) {
        data.add(index, elemen);
    }

    // Mengubah elemen pada posisi index
    public void ubahElemen(int index, String nilaiBaru) {
        data.set(index, nilaiBaru);
    }

    // Menghapus elemen dan mengembalikan nilai yang dihapus
    public String hapusElemen(int index) {
        return data.remove(index);
    }

    // Menampilkan semua elemen
    public void tampilkan() {
        for (int i = 0; i < data.size(); i++) {
            System.out.println("[" + i + "] " + data.get(i));
        }
    }
}