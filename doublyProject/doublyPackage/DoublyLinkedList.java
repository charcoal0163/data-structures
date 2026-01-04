package doublyPackage;
public class DoublyLinkedList<T> {
    protected int numElements;
    protected boolean found;
    protected DLLNode<T> first;
    protected DLLNode<T> last;
    public DoublyLinkedList() {
        first = null;
        last = null;
        numElements = 0;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public int size() {
        return numElements;
    }
    public String toString() {
        DLLNode<T> temp = first;
        String listString = "Doubly Linked List: \n";
        while (temp != null) {
            listString = listString + " " + temp.getInfo() + "\t";
            temp = temp.getFront();
        }
        return listString;
    }
    
    //----------------------------------------------------
    //         ADD MORE INSTANCE METHODS AS FOLLOWs:
    //----------------------------------------------------
    // void addFront(T element)  to add element/node in the front
    // void addEnd(T element)    to add element/node in the back
    // boolean remove(T element) to remove target element from the list
    // void removeFront()        to remove first element/node
    // void removeEnd()          to remove last element/node
    // void removeMiddle()       to remove middle element/node
    // void printReverse()       to print list backward
    // boolean search(T element) to find element in the list 
    // T getFront()              to return the first element. If size==0 then return null
    // T getLast()               to return the last element. If size==0 then return null
    // .................................................
    // ................................................. 
    // .................................................    
    
}
