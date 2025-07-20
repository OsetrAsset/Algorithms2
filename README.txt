MyArrayList
MyArrayList is a dynamic array that resizes when it reaches full capacity. It supports all basic list operations such as add, remove, get, etc.

add(T item): Adds an item to the end of the list.

add(int index, T item): Adds an item at a specific index.

get(int index): Retrieves an item at a given index.

remove(int index): Removes an item at a given index.

sort(): Sorts the list in ascending order.

size(): Returns the size of the list.

clear(): Clears all elements from the list.

MyLinkedList
MyLinkedList is a doubly linked list where you can insert and delete from both ends and in the middle.

Key Operations
add(T item): Adds an item to the end of the list.

addFirst(T item): Adds an item to the front of the list.

addLast(T item): Adds an item to the end of the list.

remove(int index): Removes an item at a specific index.

get(int index): Retrieves an item at a given index.

size(): Returns the size of the list.

clear(): Clears all elements from the list.

MyQueue
MyQueue is a queue based on a doubly linked list following FIFO order.

Key Operations
enqueue(T item): Adds an item to the end of the queue.

dequeue(): Removes and returns the front item of the queue.

peek(): Retrieves the front item without removing it.

isEmpty(): Checks whether the queue is empty.

size(): Returns the size of the queue.

clear(): Clears all elements from the queue.

MyStack
MyStack is a stack based on an array list, following LIFO order.

Key Operations
push(T item): Adds an item to the top of the stack.

pop(): Removes and returns the top item of the stack.

peek(): Retrieves the top item without removing it.

isEmpty(): Checks whether the stack is empty.

size(): Returns the size of the stack.

clear(): Clears all elements from the stack.

MyMinHeap
MyMinHeap is a minimum heap implemented with an array list. You can get and remove the smallest element.

Key Operations
insert(T item): Inserts an item into the heap.

extractMin(): Removes and returns the smallest element in the heap.

peekMin(): Retrieves the smallest element without removing it.

isEmpty(): Checks whether the heap is empty.

size(): Returns the size of the heap.

clear(): Clears all elements from the heap.
