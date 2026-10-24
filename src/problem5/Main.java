package problem5;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book b2 = new Book("1984", "George Orwell", 1949);
        Book b3 = new Book("Clean Code", "Robert C. Martin", 2008);

        System.out.println("=== Stack Test ===");
        BookStack stack = new BookStack();
        stack.push(b1);
        stack.push(b2);
        stack.push(b3);

        stack.display();

        Book popped = stack.pop();
        System.out.println("Popped: " + popped);

        Book top = stack.peek();
        System.out.println("Top: " + top);

        stack.display();

        System.out.println("=== Queue Test ===");
        BookQueue queue = new BookQueue();
        queue.enqueue(b1);
        queue.enqueue(b2);
        queue.enqueue(b3);

        queue.display();

        Book dequeued = queue.dequeue();
        Book front = queue.peek();

        queue.display();
    }
}