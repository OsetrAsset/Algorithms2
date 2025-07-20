/**
 MyStack is a generic stack implementation using an array-based list (MyArrayList).
 It supports LIFO operations such as push, pop, and peek in constant time.
 @param <T> the type of elements in the stack, must be Comparable
 */
public class MyStack<T extends Comparable<T>> {
    private MyArrayList<T> list;

    /**
     Constructs an empty MyStack.
     */
    public MyStack() {
        list = new MyArrayList<>();
    }

    /**
     Pushes an item onto the top of the stack.
     @param item the element to push
     */
    public void push(T item) {
        list.addLast(item);
    }

    /**
     Removes and returns the top item of the stack.
     @return the top item
     @throws IllegalStateException if the stack is empty
     */
    public T pop() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        T item = list.getLast();
        list.removeLast();
        return item;
    }

    /**
     Returns the top item without removing it.
     @return the top item
     @throws IllegalStateException if the stack is empty
     */
    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        return list.getLast();
    }

    /**
     Checks whether the stack is empty.
     @return true if the stack contains no elements
     */
    public boolean isEmpty() {
        return list.size() == 0;
    }

    /**
     Returns the number of elements in the stack.
     @return the size of the stack
     */
    public int size() {
        return list.size();
    }

    /**
     Clears all elements from the stack.
     */
    public void clear() {
        list.clear();
    }
}
