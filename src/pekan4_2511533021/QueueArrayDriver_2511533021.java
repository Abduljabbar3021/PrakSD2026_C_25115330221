package pekan4_2511533021;

public class QueueArrayDriver_2511533021 {

	public static void main(String[] args) {
		QueuArray_2511533021 queue = new QueuArray_2511533021(1000);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		System.out.println("Item di depan "+ queue.front_2511533021());
		System.out.println("item paling belakang "+ queue.rear_2511533021());
		System.out.println("tampilan queue");
		queue.display_2511533021();
		System.out.println();
		System.out.println(queue.dequeue_2511533021()+ "di hapus dari queue");
		System.out.println("item di depan: "+ queue.front_2511533021());
		System.out.println("item di belakang: "+ queue.rear_2511533021());
		System.out.println("tampilan queue setelah satu data di hapus");
		queue.display_2511533021();
		
	}
	
}
