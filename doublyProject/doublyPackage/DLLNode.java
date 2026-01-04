package doublyPackage;
public class DLLNode<T> {
    private DLLNode<T> back;
    private DLLNode<T> front;
    private T info;
    public DLLNode(T info) {
        this.info = info;
        front = null;
        back = null;
    }
    public void setInfo(T info){
        this.info = info;
    }
    public T getInfo(){
        return info;
    }
    public void setFront(DLLNode<T> front){
        this.front = front;
    }
    public DLLNode<T> getFront(){
        return front;
    }
    public void setBack(DLLNode<T> back){
        this.back = back;
    }
    public DLLNode<T> getBack(){
        return back;
    }
}