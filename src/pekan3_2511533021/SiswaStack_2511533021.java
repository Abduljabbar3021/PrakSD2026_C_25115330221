package pekan3_2511533021;
import java.util.ArrayList;
class Siswa_2511533021 {
	String nama_3021;
	int nim_3021;
	
	public Siswa_2511533021 (String nama_3029, int nim_3021) {
		this.nama_3021= nama_3021;
		this.nim_3021= nim_3021;
		
	}
	
	@Override
	public String toString () {
		return "NIM: " + nim_3021 + ", Nama : " +nama_3021;
	}
}
public class SiswaStack_2511533021 {
	private ArrayList<Siswa_2511533021> stack_3021;
	
	public SiswaStack_2511533021() {
		stack_3021 = new ArrayList<>();
	}
	public void push (Siswa_2511533021 mhs) {
		stack_3021.add(mhs);
	}

public Siswa_2511533021 pop() {
	if (!isEmpty()) {
		return stack_3021.remove(stack_3021.size() -1);
	 }
	 return null;
    }
 public Siswa_2511533021 peek() {
	 if (!isEmpty()) {
		 return stack_3021.get(stack_3021.size() -1 );
	 }
	 return null;
 }
 
 public boolean isEmpty () {
	 return stack_3021.isEmpty();
	 }
  public void tampilkanSiswa_3021() {
	  for (int i= stack_3021.size() -1; i>=0; i--) {
		  System.out.println(stack_3021.get(i));
	  }
  }
  public static void main (String [] args) {
	  SiswaStack_2511533021 studentstack = new SiswaStack_2511533021();
	  
	  Siswa_2511533021 mhs1 = new Siswa_2511533021 ("Ali ", 1);
	  Siswa_2511533021 mhs2 = new Siswa_2511533021 ("Boby ", 2);
	  Siswa_2511533021 mhs3 = new Siswa_2511533021 ("Charles ", 3);
	  
	  studentstack.push(mhs1);
	  studentstack.push(mhs2);
	  studentstack.push(mhs3);
	  
	  System.out.println("siswa di dalam stack : ");
	  studentstack.tampilkanSiswa_3021();
	  
	  System.out.println("siswa teratas " + studentstack.peek());
	  System.out.println("mengeluarkan siswa teratas dari stack " + studentstack.pop());
	  System.out.println("daftar siswa setelah di pop : ");
	  studentstack.tampilkanSiswa_3021();
  }
 
}