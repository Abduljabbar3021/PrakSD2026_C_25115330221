package pekan4_2511533021;
import java.util.*;

public class IterasiQueue_2511533021 {

	public static void main(String[] args) {
		Queue<String>q = new LinkedList<>();
		
		q.add("Praktikum");
		q.add("Struktur");
		q.add("Data");
		q.add("Dan");
		q.add("Algoritma");
		Iterator<String> iterator = q.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+"");
		}

	}

}
