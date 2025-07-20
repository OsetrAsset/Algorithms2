/**
 MyMinHeap is a minimum heap data structure based on a binary heap implementation using MyArrayList.
 It supports basic heap operations such as insert, extractMin, and peekMin in O(log n) time.
 @param <T> the type of elements maintained by this heap, must be Comparable
 */
public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> list;

    /**
     Constructs an empty MyMinHeap.
     */
    public MyMinHeap() {
        list = new MyArrayList<>();
    }

    /**
     Inserts an element into the heap.
     @param item the element to insert
     */
    public void insert(T item) {
        list.add(item);
        heapifyUp(list.size() - 1);
    }

    /**
     Removes and returns the smallest element in the heap.
     @return the smallest element
     @throws IllegalStateException if the heap is empty
     */
    public T extractMin() {
        if (isEmpty()) throw new IllegalStateException("Heap is empty");
        T min = list.get(0);
        T last = list.get(list.size() - 1);
        list.set(0, last);
        list.removeLast();
        heapifyDown(0);
        return min;
    }

    /**
     Returns the smallest element in the heap without removing it.
     @return the smallest element
     @throws IllegalStateException if the heap is empty
     */
    public T peekMin() {
        if (isEmpty()) throw new IllegalStateException("Heap is empty");
        return list.get(0);
    }

    /**
     Checks if the heap is empty.
     @return true if the heap contains no elements
     */
    public boolean isEmpty() {
        return list.size() == 0;
    }

    /**
     Returns the number of elements in the heap.
     @return the size of the heap
     */
    public int size() {
        return list.size();
    }

    /**
     Removes all elements from the heap.
     */
    public void clear() {
        list.clear();
    }

    // Moves the element at index up the heap to maintain heap order.
    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            T current = list.get(index);
            T parent = list.get(parentIndex);
            if (current.compareTo(parent) >= 0) break;
            list.set(index, parent);
            list.set(parentIndex, current);
            index = parentIndex;
        }
    }

    // Moves the element at index down the heap to maintain heap order.
    private void heapifyDown(int index) {
        int size = list.size();
        while (index < size) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int smallest = index;

            if (leftChild < size && list.get(leftChild).compareTo(list.get(smallest)) < 0) {
                smallest = leftChild;
            }
            if (rightChild < size && list.get(rightChild).compareTo(list.get(smallest)) < 0) {
                smallest = rightChild;
            }
            if (smallest == index) break;

            T tmp = list.get(index);
            list.set(index, list.get(smallest));
            list.set(smallest, tmp);
            index = smallest;
        }
    }
}
