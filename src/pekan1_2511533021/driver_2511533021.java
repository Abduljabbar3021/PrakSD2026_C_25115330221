package pekan1_2511533021;


import java.util.ArrayList;

public class driver_2511533021 {
 public static void main(String[] args) {
     String nim = "123456789"; 

     
     ArrayList<mobil_2511533021> daftarMobil = new ArrayList<>();

     
     mobil_2511533021 m1 = new mobil_2511533021("Avanza", 2020, 1300, 150000000, "Toyota");
     daftarMobil.add(m1);

     mobil_2511533021 m2 = new mobil_2511533021("Xenia", 2021, 1300, 160000000, "Daihatsu");
     daftarMobil.add(m2);

     
     System.out.println("Daftar Mobil (NIM: " + nim + "):");
     for (mobil_2511533021 m : daftarMobil) {
         m.tampilkanInfo();
     }

     daftarMobil.remove(m1);

     System.out.println("\nSetelah menghapus satu mobil:");
     for (mobil_2511533021 m : daftarMobil) {
         m.tampilkanInfo();
     }
 }
}