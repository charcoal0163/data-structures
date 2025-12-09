package lists_code;
public class ArrayUnsortedList<T> implements ListInterface<T> {
    protected final int DEFCAP = 100;
    protected int origCap;
    protected T[] list;
    protected int numElements = 0;
    protected int currentPos;
    protected boolean found;
    protected int location;
    public ArrayUnsortedList() {
        list = (T[]) new Object[DEFCAP];
        origCap = DEFCAP;
    }
    public ArrayUnsortedList(int origCap) {
        list = (T[]) new Object[origCap];
        this.origCap = origCap;
    }
    protected void enlarge() {
        T[] larger = (T[]) new Object[list.length + origCap];
        for (int i = 0; i < numElements; i++) {
            larger[i] = list[i];
        }
        list = larger;
    }
    protected void find(T target) {
        location = 0;
        found = false;
        while (location < numElements) {
            if (list[location].equals(target)) {
                found = true;
                return;
            }
            else {
                location++;
            }
        }
    }
    public void add(T element) {
        if (numElements == list.length) {
            enlarge();
        }
        list[numElements] = element;
        numElements++;
    }
    public boolean remove(T element) {
        find(element);
        if (found) {
            list[location] = list[numElements - 1];
            list[numElements - 1] = null;
            numElements--;
        }
        return found;
    }
    public int size() {
        return numElements;
    }
    public boolean contains(T element) {
        find(element);
        return found;
    }
    public T get(T element) {
        find(element);
        if (found) {
            return list[location];
        }
        else {
            return null;
        }
    }
    public String toString() {
        String listString = "List:\n";
        for (int i = 0; i < numElements; i++) {
            listString = listString + "  " + list[i] + "\n";
        }
        return listString;
    }
    public void reset() {
        currentPos = 0;
    }
    public T getNext() {
        T next = list[currentPos];
        if (currentPos == (numElements - 1)) {
            currentPos = 0;
        } else {
            currentPos++;
        }
        return next;
    }
    public void printFirst(){
        //option 1:
        //since the method is in the class, we can immediately print the first element through the array
        
        System.out.println(list[0]);
        
        //option 2:
        //we can use the methods that already have an implementation within the class
        
        /*reset();
        System.out.println(getNext());*/
    }
    public void printList(){
        for(int i = 0; i < numElements; i++){
            System.out.print(list[i] + " ");
        }
    }
    public void nElements(int n){
        for(int i = 0; i < n; i++){
            System.out.print(list[i] + " ");
        }
    }
    public void clear(){
        for(int i = 0; i <  numElements; i++){
            list[i] = null;
        }
        numElements = 0;
    }
    public int sum(){
        reset();
        int sum = 0;
        for(int i = 0; i < numElements; i++){
            sum += (Integer)getNext();
        }
        return sum;
    }
    public T showFirst(){
        if(numElements != 0){
            return list[0];
        }
        return null;
    }
    public T showLast(){
        if(numElements != 0){
            return list[numElements - 1];
        }
        return null;
    }
    public T showMiddle(){
        if(numElements != 0){
            return list[numElements / 2];
        }
        return null;
    }
    public void removeFirst(){
        if(numElements != 0){
            remove(list[0]);
        }
    }
    public void removeLast(){
        if(numElements != 0){
            remove(list[numElements - 1]);    
        }
    }
    public void removeMiddle(){
        if(numElements != 0){
            remove(list[numElements / 2]);
        }
    }
    public ArrayUnsortedList<T> slice(int first, int last){
        if(first >= 0 && last >= 0 && last < numElements && first <= last){
            ArrayUnsortedList<T> sliced = new ArrayUnsortedList<>();
            for (int i = first; i < last; i++) {
                sliced.add(list[i]);
            }
            return sliced;
        }
        return null;
    }
}
