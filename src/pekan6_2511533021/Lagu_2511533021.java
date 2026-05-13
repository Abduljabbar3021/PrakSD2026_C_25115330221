// Kelas Lagu_3021
package pekan6_2511533021;

public class Lagu_2511533021 {

    // atribut lagu
    String judul_3021;
    String penyanyi_3021;

    // pointer next dan prev
    Lagu_2511533021 next_3021;
    Lagu_2511533021 prev_3021;

    // constructor
    public Lagu_2511533021(String judul_3021, String penyanyi_3021) {
        this.judul_3021 = judul_3021;
        this.penyanyi_3021 = penyanyi_3021;
        this.next_3021 = null;
        this.prev_3021 = null;
    }

    // getter judul
    public String getJudul_3021() {
        return judul_3021;
    }

    // setter judul
    public void setJudul_3021(String judul_3021) {
        this.judul_3021 = judul_3021;
    }

    // getter penyanyi
    public String getPenyanyi_3021() {
        return penyanyi_3021;
    }

    // setter penyanyi
    public void setPenyanyi_3021(String penyanyi_3021) {
        this.penyanyi_3021 = penyanyi_3021;
    }
}