package pekan3_2511533021;

public class stackArray_2511533021 {
	static final int MAX_3021= 1000;
	int top_3021;
	int a[] = new int [MAX_3021];
	boolean isEmpty_3021()  
	{
		return (top_3021 < 0) ;
	}
	stackArray_2511533021() 
	{
		top_3021=-1;
	}
	boolean push_3021 (int x)
	{
		if (top_3021>= (MAX_3021 - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top_3021] = x;
			System.out.println( x  + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_3021() 
	{
		if (top_3021 <= 0 ) {
			System.out.println("stack underflow");
			return 0;
		}else {
			int x = a[top_3021--];
			return x;
		}
	}
	int peek_3021() 
	{
		if (top_3021<0) 
		{
			System.out.println("stack underflow");
			return 0;
		}
		else 
		{
			int x = a [top_3021];
			return x;
		}
	}
	void print_3021 () {
		for (int i=top_3021; i>-1;i--) {
			System.out.print(" " +a[i]);
		}
	}

}