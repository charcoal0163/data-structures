package lists_code;
public class ArraySortedList<T> extends ArrayUnsortedList<T> implements ListInterface<T> {
    public ArraySortedList() {
        super();
    }
    public ArraySortedList(int origCap) {
        super(origCap);
    }
    public void add(T element) 
    // Precondition:  element is Comparable.    
    // Adds element to this list.
    {
        T listElement;
        int location = 0;
        if (numElements == list.length) {
            enlarge();
        }
        while (location < numElements) {
            listElement = (T) list[location];
            if (((Comparable) listElement).compareTo(element) < 0) // list element < add element
            {
                location++;
            } else {
                break;   // list element >= add element
            }
        }
        for (int index = numElements; index > location; index--) {
            list[index] = list[index - 1];
        }
        list[location] = element;
        numElements++;
    }
    public boolean remove(T element) // Removes an element e from this list such that e.equals(element)
    // and returns true; if no such element exists, returns false.
    {
        find(element);
        if (found) {
            for (int i = location; i <= numElements - 2; i++) {
                list[i] = list[i + 1];
            }
            list[numElements - 1] = null;
            numElements--;
        }
        return found;
    }
}