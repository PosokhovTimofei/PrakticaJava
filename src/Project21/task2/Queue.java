package src.Project21.task2;

interface Queue {
    void enqueue(Object element);
    Object dequeue();
    Object element();
    int size();
    boolean isEmpty();
    void clear();
}