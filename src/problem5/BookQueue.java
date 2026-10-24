package problem5;

import java.util.LinkedList;

public class BookQueue {
    private LinkedList<Book> queue;

    public BookQueue() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(Book book) {
        queue.addLast(book);
    }

    public Book dequeue() {
        // code here and don't to test if it's empty
        System.out.println("Dequeued : " +queue.getFirst());
        return queue.removeFirst();
    }

    public Book peek() {
        // code here and don't to test if it's empty
        System.out.println("Font : " + queue.getFirst());
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        System.out.println("Queue contents (front to back):");
        for (Book b : queue){
            if (b != null){
                System.out.println(b.toString());
            }

        }

    }
}

