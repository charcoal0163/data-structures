/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author user
 */
public class QueueOverflowException extends RuntimeException
{
    public QueueOverflowException()
    {
        super();
    }
    public QueueOverflowException(String msg)
    {
        super(msg);
    }
}
    
