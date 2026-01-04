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
    public void addFront(T element){
        DLLNode<T> jdide = new DLLNode<>(element);
        if(size() == 0){
            first = last = jdide;
        }
        else{
            jdide.setFront(first);
            first.setBack(jdide);
            first = jdide;
        }
        ++numElements;
    }
    public void addEnd(T element){
        DLLNode<T> jdide = new DLLNode<>(element);
        if(isEmpty()){
            first = last = jdide;
        }
        else{
            last.setFront(jdide);
            jdide.setBack(last);
            last = jdide;
        }
        ++numElements;
    }
    public void removeFront(){
        if(!isEmpty()){
            if(size() == 1){
                //or: if(first == last)
                first = last = null;
            }
            else{
                first = first.getFront();
                first.setBack(null);
            }
            --numElements;
        }
    }
    public void removeEnd(){
        if(!isEmpty()){
            if(first == last){
                //or: if(size() == 1)
                first = last = null;
            }
            else{
                last = last.getBack();
                last.setFront(null);
            }
            --numElements;
        }
    }
    public T getFront(){
        if(isEmpty()){
            return null;
        }
        else{
            return first.getInfo();
        }
    }
    public T getLast(){
        if(isEmpty()){
            return null;
        }
        else{
            return last.getInfo();
        }
    }
    
    // void removeMiddle()       to remove middle element/node
    // void printReverse()       to print list backward
    // boolean search(T element) to find element in the list 
    // boolean remove(T element) to remove target element from the list
    // .................................................
    // .................................................
    // .................................................
}
