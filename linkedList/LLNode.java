package linkedList;
public class LLNode<T> {
    private T info;
    private LLNode<T> link;
    public LLNode(T info) {
        this.info = info;
        link = null;
    }
    public void setInfo(T info){
        this.info = info;
    }
    public T getInfo(){
        return info;
    }
    public void setLink(LLNode<T> link){
        this.link = link;
    }
    public LLNode<T> getLink(){
        return link;
    }
}