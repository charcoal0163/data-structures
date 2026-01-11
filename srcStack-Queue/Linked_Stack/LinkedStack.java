package Linked_Stack;
public class LinkedStack<T> implements UnboundedStackInterface<T>{
    protected LLNode<T> top;
    public LinkedStack(){
        top = null;
    }
    public void push(T element){
        LLNode<T> newNode = new LLNode<T>(element);
        newNode.setLink(top);
        top = newNode;
    }
    public void pop(){
        if (!isEmpty()){
            top = top.getLink();
        }
        else
            throw new StackUnderflowException("Pop attempted on an empty stack.");
    }
    public T top(){
        if (!isEmpty())
            return top.getInfo();
        else
            throw new StackUnderflowException("Top attempted on an empty stack.");
    }
    public boolean isEmpty(){
        if (top == null)
            return true;
        else
            return false;
    }
    public void dup(){
        //duplicate top node
        LLNode<T> r = new LLNode<>(top.getInfo());
        r.setLink(top);
        top = r;
    }
}