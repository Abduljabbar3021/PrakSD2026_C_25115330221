package pekan4_2511533021;

public class QueuArray_2511533021 {
	int front, rear, size;
	int capacity;
	int array[];
	
	public QueuArray_2511533021(int capacity) {
		this.capacity = capacity;
		front = this.size =0;
		rear = capacity - 1;
		array = new int [this.capacity];
	}
	boolean isFull (QueuArray_2511533021 queue) {
		return (queue.size == queue.capacity);
	}
	boolean isEmpty (QueuArray_2511533021 queue) {
		return (queue.size == 0);
	}
	void enqueue(int item) {
		if (isFull (this))
			return;
		this.rear = (this.rear + 1) % this.capacity;
		this.array[this.rear] = item ;
		this.size = this.size +1;
		System.out.println(item + " enqueud to queue");
	}
	int dequeue_2511533021() {
		if (isEmpty (this))
			return Integer.MIN_VALUE;
		int item = this.array [this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size = this.size -1 ;
		return item;
	}
	int front_2511533021 () {
		if (isEmpty (this))
			return Integer.MIN_VALUE;
		
		return this.array[this.front];
	}
	int rear_2511533021 () {
		if (isEmpty (this))
			return Integer.MIN_VALUE;
		
		return this.array[this.rear];
	}
	void display_2511533021() {
		int i;
		if (front == rear) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		for (i = front; i< rear; i++) {
			System.out.printf("%d <---", array[i]);
		}
		return;
	}
}
	
