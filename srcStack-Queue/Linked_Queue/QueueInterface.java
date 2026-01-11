package Linked_Queue;

public interface QueueInterface<T>{
    T dequeue() throws QueueUnderflowException;
    boolean isEmpty(); 
}
