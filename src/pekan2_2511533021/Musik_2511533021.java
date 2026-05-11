package Tugas2_2511533021;

public class Musik_2511533021 {
    // Atribut (pakai 4 digit terakhir NIM: 3021)
    private String judul_3021;
    private String penyanyi_3021;
    private int durasi_3021;

    // Constructor
    public Musik_2511533021(String judul, String penyanyi, int durasi) {
        this.judul_3021 = judul;
        this.penyanyi_3021 = penyanyi;
        this.durasi_3021 = durasi;
    }

    // Getter
    public String getJudul() {
        return judul_3021;
    }

    public String getPenyanyi() {
        return penyanyi_3021;
    }

    public int getDurasi() {
        return durasi_3021;
    }

    // Setter
    public void setJudul(String judul) {
        this.judul_3021 = judul;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi_3021 = penyanyi;
    }

    public void setDurasi(int durasi) {
        this.durasi_3021 = durasi;
    }

    // Method tampil
    public void tampilkan() {
        System.out.println("Judul    : " + judul_3021);
        System.out.println("Penyanyi : " + penyanyi_3021);
        System.out.println("Durasi   : " + durasi_3021 + " detik");
        System.out.println("------------------------");
    }
}