package CollectionFramework;

import java.util.*;

public class PriorityQueueDo {
    void implementPriorityQueue() {
        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.add("b");
        queue.add("a");
        queue.add("d");
        queue.add("c");
        System.out.println("Head: " + queue.peek());
        Iterator itr = queue.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        //same, they both remove from the head
        queue.remove();
        queue.poll();
        System.out.println(queue);

        //Now implementing book class
        class Book implements Comparable<Book> {
            int id;
            String BookName;
            int cost;

            Book(int id, String BookName, int cost) {
                this.id = id;
                this.BookName = BookName;
                this.cost = cost;
            }

            public int compareTo(Book b) {
                if (id > b.id)
                    return 1;
                else if (id < b.id)
                    return -1;
                else
                    return 0;
            }
        }

        PriorityQueue<Book> queueBook = new PriorityQueue<Book>();

        //Creating Books
        Book b1 = new Book(121, "Let us C", 8);
        Book b2 = new Book(233, "Operating System", 6);
        Book b3 = new Book(101, "Data Communications & Networking", 4);

        queueBook.add(b1);
        queueBook.add(b2);
        queueBook.add(b3);
        queueBook.add(b1);

        for (Book b : queueBook) {
            System.out.println(b.id + " " + b.BookName + " " + b.cost);
        }

    }
}
