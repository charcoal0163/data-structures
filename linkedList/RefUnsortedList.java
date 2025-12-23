package linkedList;
public class RefUnsortedList<T> implements ListInterface<T> {
    protected int numElements;
    protected LLNode<T> currentPos;
    protected boolean found;
    protected LLNode<T> location;
    protected LLNode<T> previous; 
    protected LLNode<T> list;
    public RefUnsortedList() {
        numElements = 0;
        list = null;
        currentPos = null;
    }
    public void add(T element) {
        LLNode<T> newNode = new LLNode<T>(element);
        newNode.setLink(list);
        list = newNode;
        numElements++;
    }
    protected void find(T target){
        location = list;
        found = false;
        while (location != null) {
            if (location.getInfo().equals(target)){
                found = true;
                return;
            }
            else {
                previous = location;
                location = location.getLink();
            }
        }
    }
    public int size(){
        return numElements;
    }
    public boolean contains(T element){
        find(element);
        return found;
    }
    public boolean remove(T element){
        find(element);
        if (found) {
            if (list == location) {
                list = list.getLink();
            }
            else {
                previous.setLink(location.getLink());
            }
            numElements--;
        }
        return found;
    }
    public T get(T element){
        find(element);
        if (found) {
            return location.getInfo();
        }
        else {
            return null;
        }
    }
    public String toString(){
        LLNode<T> currNode = list;
        String listString = "List:\n";
        while (currNode != null) {
            listString = listString + " " + currNode.getInfo() + "\t";
            currNode = currNode.getLink();
        }
        return listString;
    }
    public void reset(){
        currentPos = list;
    }
    public T getNext(){
        T next = currentPos.getInfo();
        if (currentPos.getLink() == null) {
            currentPos = list;
        }
        else {
            currentPos = currentPos.getLink();
        }
        return next;
    }
    public void removeFirst(){
        if (list != null){
            list = list.getLink();
            --numElements;
        }
    }
    public void removeLast(){
        if (list != null){
            if (list.getLink() == null){
                list = null;
            }
            else{
                LLNode<T> t = list;
                while (t.getLink().getLink()!=null){
                    t = t.getLink();
                }
                t.setLink(null);
            }
            --numElements;
        }
    }
    public void removeMiddle(){
        if (list != null){
            if (list.getLink() == null){
                list = null;
            }
            else if (numElements == 2){
                list.setLink(null);
            }
            else {                
                int middle = numElements/2;
                LLNode<T> t =list;
                for(int i = 1;i<middle;i++){
                    t = t.getLink();
                }
                t.setLink(t.getLink().getLink());                                                
            }
            --numElements;
        }
    }
    public void addFirst(T e){
        add(e);
    }
    public void addLast(T e){
        LLNode<T> newNode = new LLNode<T>(e);        
        if (list == null){
            list = newNode;
        }
        else {
            LLNode<T> t = list;
            while(t.getLink()!=null){
                t = t.getLink();
            }
            t.setLink(newNode);
        }       
        ++numElements;
    }
    public void duplicateFirstAtLast(){
        if(list != null){
            LLNode<T> first = new LLNode<>(list.getInfo());
            LLNode<T> point = list;
            while(point.getLink() != null){
                point = point.getLink();
            }
            point.setLink(first);
            ++numElements;
        }
    }
    public void deleteSpec(int k){
        if(k <= numElements){
            if(k == 1){
                list = list.getLink();
            }
            else{
                LLNode<T> previous, current;
                previous = current = list;
                for(int i = 1; i < k; i++){
                    previous = current;
                    current = current.getLink();
                }
                previous.setLink(current.getLink());
            }
            --numElements;
        }
    }
    public void removeDuplicate(){
        reset();
        RefUnsortedList<T> temp = new RefUnsortedList<>();
        for(int i = 0; i < numElements; i++){
            T e = getNext();
            if(!temp.contains(e)){
                temp.add(e);
            }
        }
        list = temp.list;
        numElements = temp.size();
        //alternatively
        //numElements = temp.numElements;
    }
}
