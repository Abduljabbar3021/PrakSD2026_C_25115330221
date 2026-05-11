package pekan4_2511533021;
import java.util.Scanner;

public class AntrianLoket_2511533021 {
    private String[] queue;
    private int front;
    private int rear;
    private int max;

    // Constructor
    public AntrianLoket_2511533021(int size) {
        max = size;
        queue = new String[max];
        front = 0;
        rear = -1;
    }

    // Cek kosong
    public boolean isEmpty() {
        return rear < front;
    }

    // Cek penuh
    public boolean isFull() {
        return rear == max - 1;
    }

    // Enqueue
    public void enqueue(String data) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            rear++;
            queue[rear] = data;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    // Dequeue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(queue[front] + " telah dilayani");
            front++;
        }
    }

    // Display
    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            int no = 1;
            for (int i = front; i <= rear; i++) {
                System.out.println(no + ". " + queue[i]);
                no++;
            }
        }
    }

    // Reverse
    public void reverse() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            int start = front;
            int end = rear;

            while (start < end) {
                String temp = queue[start];
                queue[start] = queue[end];
                queue[end] = temp;

                start++;
                end--;
            }
            System.out.println("Antrian berhasil dibalik");
        }
    }

    // Main program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AntrianLoket_2511533021 antrian = new AntrianLoket_2511533021(10);

        int pilihan;

        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang enter

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = input.nextLine();
                    antrian.enqueue(nama);
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.display();
                    break;

                case 4:
                    antrian.reverse();
                    break;

                case 5:
                    System.out.println("Program Selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}