package pekan3_2511533021;
import java.util.Stack;
public class NilaiMaksimum_2511533021 {
	public static int max (Stack <Integer>s_3021) {	
	Stack <Integer> backup_3021 = new Stack <Integer>();
	int maxValue_3021 = s_3021.pop();
	backup_3021.push (maxValue_3021);
	while (!s_3021.isEmpty()) {
		int next_3021=s_3021.pop();
		backup_3021.push(next_3021);
		maxValue_3021 = Math.max(maxValue_3021, next_3021);
	}
	while (!backup_3021.isEmpty() ) {
		s_3021.push(backup_3021.pop());
	}
	return maxValue_3021;
  }
	public static void main(String[] args) {
		Stack <Integer> s_3021 = new Stack<Integer> ();
		s_3021.push (70);
		s_3021.push (12);
		s_3021.push (20);
		System.out.println("isi stack " + s_3021);
		System.out.println("Stack Teratas " + s_3021.peek());
		System.out.println("nilai maksimum " + max(s_3021));
		
		
	}

}
