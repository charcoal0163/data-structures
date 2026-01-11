package Linked_Queue;
public class QueueOverflowException  extends RuntimeException {
    public QueueOverflowException(){
        super();
    }
    public QueueOverflowException(String msg){
        super(msg);
    }
}