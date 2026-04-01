package pekan1_2511533021;


public class mobil_2511533021 {
 private String nama;
 private int tahun;
 private int cc;
 private double harga;
 private String merk;

 
 public mobil_2511533021(String nama, int tahun, int cc, double harga, String merk) {
     this.nama = nama;
     this.tahun = tahun;
     this.cc = cc;
     this.harga = harga;
     this.merk = merk;
 }

 
 public String getNama() { return nama; }
 public int getTahun() { return tahun; }
 public int getCc() { return cc; }
 public double getHarga() { return harga; }
 public String getMerk() { return merk; }


 public void setNama(String nama) { this.nama = nama; }
 public void setTahun(int tahun) { this.tahun = tahun; }
 public void setCc(int cc) { this.cc = cc; }
 public void setHarga(double harga) { this.harga = harga; }
 public void setMerk(String merk) { this.merk = merk; }

 
 public void tampilkanInfo() {
     System.out.println("Mobil: " + nama + " | Tahun: " + tahun +
                        " | CC: " + cc + " | Harga: " + harga +
                        " | Merk: " + merk);
 }
}
