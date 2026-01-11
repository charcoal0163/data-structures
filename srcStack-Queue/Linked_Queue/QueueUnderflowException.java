package Linked_Queue;
public class QueueUnderflowException  extends RuntimeException {
    public QueueUnderflowException(){
        super();
    }
    public QueueUnderflowException(String msg){
        super(msg);
    }
}