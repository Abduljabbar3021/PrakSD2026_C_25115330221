package pekan3_2511533021;

public class stackArrayDriver_2511533021 {

	public static void main(String[] args) {
		stackArray_2511533021 s = new stackArray_2511533021 ();
		s.push_3021(10);
		s.push_3021(20);
		s.push_3021(30);
		System.out.println(s.pop_3021() + " dikeluarkan dari stack");
		System.out.println("elemen teratas adalah : " + s.peek_3021());
		System.out.print("element pada stack    :");
		s.print_3021();

	}

}