/**
 * MyQueue is a generic queue implementation backed by a doubly linked list (MyLinkedList).
 * It supports typical queue operations in FIFO order with efficient O(1) enqueue and dequeue.
 *
 * @param <T> the type of elements in the queue, must be Comparable
 */
public class MyQueue<T extends Comparable<T>> {
    private MyLinkedList<T> list;

    /**
     Constructs an empty MyQueue.
     */
    public MyQueue() {
        list = new MyLinkedList<>();
    }

    /**
     Adds an item to the end of the queue.
     @param item the element to add
     */
    public void enqueue(T item) {
        list.addLast(item);
    }

    /**
     Removes and returns the front item of the queue.
     @return the front item
     @throws IllegalStateException if the queue is empty
     */
    public T dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        T item = list.getFirst();
        list.removeFirst();
        return item;
    }

    /**
     Returns the front item without removing it.
     @return the front item
     @throws IllegalStateException if the queue is empty
     */
    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        return list.getFirst();
    }

    /**
     Checks whether the queue is empty.
     @return true if the queue contains no elements
     */
    public boolean isEmpty() {
        return list.size() == 0;
    }

    /**
     Returns the number of elements in the queue.
     @return the size of the queue
     */
    public int size() {
        return list.size();
    }

    /**
     Clears all elements from the queue.
     */
    public void clear() {
        list.clear();
    }
}
