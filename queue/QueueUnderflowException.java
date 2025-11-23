/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author user
 */
public class QueueUnderflowException extends RuntimeException
{
    public QueueUnderflowException()
    {
        super();
    }
    public QueueUnderflowException(String msg)
    {
        super(msg);
    }
    
}
