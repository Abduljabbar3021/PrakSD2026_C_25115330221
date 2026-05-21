package pekan7_2511533021;

public class Mahasiswa_2511533021 {

    private String nama_3021;
    private String nim_3021;
    private String prodi_3021;

    // Constructor
    public Mahasiswa_2511533021(String nama_3021, String nim_3021, String prodi_3021) {
        this.nama_3021 = nama_3021;
        this.nim_3021 = nim_3021;
        this.prodi_3021 = prodi_3021;
    }
    // Getter dan Setter
    public String getNama_3021() {
        return nama_3021;
    }
    public void setNama_3021(String nama_3021) {
        this.nama_3021 = nama_3021;
    }
    public String getNim_3021() {
        return nim_3021;
    }
    public void setNim_3021(String nim_3021) {
        this.nim_3021 = nim_3021;
    }

    public String getProdi_3021() {
        return prodi_3021;
    }
    public void setProdi_3021(String prodi_3021) {
        this.prodi_3021 = prodi_3021;
    }
    @Override
    public String toString() {
        return nama_3021 + " | " + nim_3021 + " | " + prodi_3021;
    }
}