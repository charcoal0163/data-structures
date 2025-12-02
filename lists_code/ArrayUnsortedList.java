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
}
