/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author user
 */
public interface BoundedQueueInterface <T> extends QueueInterface<T>
{
  void enqueue(T element) throws QueueOverflowException;

  // Throws QueueOverflowException if this queue is full,
  // otherwise adds element to the rear of this queue.

  boolean isFull();

  // Returns true if this queue is full, otherwise returns false.
} 
    
