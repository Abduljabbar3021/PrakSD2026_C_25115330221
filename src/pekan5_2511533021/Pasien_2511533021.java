package pekan5_2511533021;

public class Pasien_2511533021 {
    String namaPasien_3021;
    String penyakit_3021;
    int nomorAntrian_3021;
    Pasien_2511533021 next_3021;

    // Constructor
    public Pasien_2511533021(String namaPasien_3021, String penyakit_3021, int nomorAntrian_3021) {
        this.namaPasien_3021 = namaPasien_3021;
        this.penyakit_3021 = penyakit_3021;
        this.nomorAntrian_3021 = nomorAntrian_3021;
        this.next_3021 = null;
    }

    // Getter
    public String getNamaPasien_3021() {
        return namaPasien_3021;
    }

    public String getPenyakit_3021() {
        return penyakit_3021;
    }

    public int getNomorAntrian_3021() {
        return nomorAntrian_3021;
    }

    public Pasien_2511533021 getNext_3021() {
        return next_3021;
    }

    // Setter
    public void setNamaPasien_3021(String namaPasien_3021) {
        this.namaPasien_3021 = namaPasien_3021;
    }

    public void setPenyakit_3021(String penyakit_3021) {
        this.penyakit_3021 = penyakit_3021;
    }

    public void setNomorAntrian_3021(int nomorAntrian_3021) {
        this.nomorAntrian_3021 = nomorAntrian_3021;
    }

    public void setNext_3021(Pasien_2511533021 next_3021) {
        this.next_3021 = next_3021;
    }
}