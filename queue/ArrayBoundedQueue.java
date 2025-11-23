/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author user
 * @param <T>
 */
public class ArrayBoundedQueue<T> implements BoundedQueueInterface<T>
{
  protected final int DEFCAP = 100; // default capacity
  protected T[] elements;           // array that holds queue elements
  protected int numElements = 0;    // number of elements in the queue
  protected int front = 0;          // index of front of queue
  protected int rear;               // index of rear of queue

  public ArrayBoundedQueue() 
  {
    elements = (T[]) new Object[DEFCAP];
    rear =  DEFCAP - 1;
  }

  public ArrayBoundedQueue(int maxSize) 
  {
    elements = (T[]) new Object[maxSize];
    rear =  maxSize - 1;
  }
  @Override
  public void enqueue(T element)
// Throws QueueOverflowException if this queue is full,
// otherwise adds element to the rear of this queue.
  {  
      if (isFull())
        throw new QueueOverflowException("Enqueue attempted on a full queue.");
      else
      {
          rear = (rear + 1) % elements.length; // used for Wrapping
          elements[rear] = element;
          numElements = numElements + 1;
      }
  } 
  @Override
  public T dequeue()
// Throws QueueUnderflowException if this queue is empty,
// otherwise removes front element from this queue and returns it.
  {       
      if (isEmpty())
          throw new QueueUnderflowException("Dequeue attempted on empty queue.");
      else 
      {
          T toReturn = elements[front];
          elements[front] = null;
          front = (front + 1) % elements.length;
          numElements = numElements - 1;
          return toReturn;
      }
  }
  @Override
  public boolean isEmpty()
// Returns true if this queue is empty, otherwise returns false
  {              
      return (numElements == 0);
  }
  @Override
  public boolean isFull()
// Returns true if this queue is full, otherwise returns false.
  {              
      return (numElements == elements.length);
  } 
}// End of class ArrayBndQueue