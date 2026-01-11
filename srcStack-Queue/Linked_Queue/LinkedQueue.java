package Linked_Queue;
public class LinkedQueue<T> implements UnboundedQueueInterface<T>{
    protected LLNode<T> front;   // reference to the front of this queue
    protected LLNode<T> rear;    // reference to the rear of this queue

    public LinkedQueue(){
        front = null;
        rear = null;
    }
    public void enqueue(T element){ 
        LLNode<T> newNode = new LLNode<T>(element);
        if (rear == null)
            front = newNode;
        else
            rear.setLink(newNode);
        rear = newNode;
    }
    public T dequeue(){
        if (isEmpty())
            throw new QueueUnderflowException("Dequeue attempted on empty queue.");
        else{
            T element;
            element = front.getInfo();
            front = front.getLink();
            if (front == null)
                rear = null;
            return element;
        }
    }
    public boolean isEmpty(){
        if (front == null)
            return true;
        else
            return false;
    }
}