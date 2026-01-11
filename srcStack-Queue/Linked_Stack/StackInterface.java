package Linked_Stack;
public interface StackInterface <T> {
    void pop() throws StackUnderflowException;
    T top() throws StackUnderflowException;
    boolean isEmpty();    
}

