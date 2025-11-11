/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author user
 */
public class StackOverflowException extends RuntimeException
{
    public StackOverflowException()
    {
        super();
    }
    public StackOverflowException(String msg)
    {
        super(msg);
    }
}
