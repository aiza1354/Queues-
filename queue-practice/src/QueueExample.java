import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main (String [] args) {
        // LinkedLists actually allow all the items of a list to be linked together.
        // Each item is known via their position behind or before an item
        // Create a queue using LinkedList implementation
        Queue <String> queue = new LinkedList<>();

        // ADD METHODS

        // add() - adds element to queue, throws an exception if queue is full
        queue.add("First");
        queue.add("Second");
        queue.add ("Third");

        // offer() - adds element to queue. returns false if queue is full
        // preferred in capacity restricted queues

        queue.offer("Fourth");
        System.out.println("Queue after adding: " + queue);
        // Output: [First, Second, Third, Fourth ]

        // peek() - Returns head element WITHOUT removing it
        // Returns null if queue is empty
        String head = queue.peek();
        System.out.println("Head element (peek): " + head );
        System.out.println("Queue after peek: " + queue);
        // Output: First (element still in queue)

        // element() - returns head element without removing it
        // Throw exception if queue is empty
        String headAlt = queue.element();
        System.out.println("Head element (element) " + headAlt);

        // REMOVE METHODS
        // poll() - removes and returns head element
        // returns null if queue is empty
        String removed = queue.poll();
        System.out.println("Removed element (poll): " + removed);
        System.out.println("Queue after poll: " + queue);
        // Output: [Second, Third, Fourth ]

        // remove() - Removed and returns head element
        // throws exception if queue is empty
        String removedAlt = queue.remove();
        System.out.println("Removed element (remove): " + removedAlt);
        System.out.println("Queue after remove: " + queue);
        // Output: [Third, Fourth]

        // Other Useful Methods

        // size() - Returns number of elements in queue
        System.out.println("Queue size: " + queue.size());

        // isEmpty() - checks if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
        // clear () - removes all elements from queue
        queue.clear();
        System.out.println("Queue after clear: " + queue);
        System.out.println("Is queue empty? " + queue.isEmpty());
    }

}

