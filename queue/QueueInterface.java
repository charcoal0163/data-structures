/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author user
 */
public interface QueueInterface<T>
{
  T dequeue() throws QueueUnderflowException;
  // Throws QueueUnderflowException if this queue is empty,
  // otherwise removes front element from this queue and returns it.
  boolean isEmpty();
  // Returns true if this queue is empty, otherwise returns false.
  
}