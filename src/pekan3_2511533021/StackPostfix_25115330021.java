package pekan3_2511533021;
import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_25115330021 {
	
	public static int postfixEvaluate_3021(String expression) {
		Stack <Integer> s = new Stack <Integer>();
		Scanner input_3021 = new Scanner (expression);
		while (input_3021.hasNext()) {
			if (input_3021.hasNext()) {
				s.push(input_3021.nextInt());
			} else {
				String operator_3021 = input_3021.next();
				int operand2 = s.pop();
				int operand1 = s.pop();
				if (operator_3021.equals("+")) {
					s.push (operand1+operand2);
				} else if (operator_3021.equals("-")){
					s.push(operand1-operand2);
				}else if (operator_3021.equals("*")) {
					s.push(operand1*operand2);
				}else {
					s.push (operand1/operand2);
				}
			}
		}
		input_3021.close ();
		return s.pop();
	}
	public static void main (String []args) {
		System.out.println("hasil postfix = "+ postfixEvaluate_3021("5 2 5 * + 7 - "));
	}

}
