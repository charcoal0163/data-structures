
package stack;

// Array-Based Stack Implementations
public class ArrayBoundedStack<T> implements StackInterface<T>
{
    protected final int DEFCAP = 100;
    protected T[] elements;
    protected int topIndex = -1;
    
    public ArrayBoundedStack()
    {
        elements = (T[]) new Object[DEFCAP];        
    }
    public ArrayBoundedStack(int maxSize)
    {
        elements = (T[]) new Object[maxSize];        
    }   
    
    public boolean isEmpty()
    {
        return (topIndex == -1);        
    }
    public boolean isFull()
    {
        return ( topIndex == (elements.length - 1) );        
    }
    public void push(T element)
    {
        if (isFull())
            throw new StackOverflowException ("Push attempted on a full stack ");
        else        
        {
            topIndex++;
            elements[topIndex]= element;
        }                    
    }
    
    public void pop()
    {
        if (isEmpty())
             throw new StackUnderflowException ("Pop attempted on an empty stack ");
        else
            {
                elements[topIndex] = null;
                topIndex--;            
            }                   
    }
    public T top()
    {
        T topOfStack = null;
        if (isEmpty())
            throw new StackUnderflowException ("Top attempted on an empty stack ");
        else
            topOfStack = elements[topIndex];        
            
        return topOfStack;
    }        
}
