package lists_code;
public class ArraySortedList<T> extends ArrayUnsortedList<T> implements ListInterface<T> {
    public ArraySortedList() {
        super();
    }
    public ArraySortedList(int origCap) {
        super(origCap);
    }
    public void add(T element) {
        T listElement;
        int location = 0;
        if (numElements == list.length) {
            enlarge();
        }
        while (location < numElements) {
            listElement = (T) list[location];
            if (((Comparable) listElement).compareTo(element) < 0) {
                location++;
            }
            else {
                break;
            }
        }
        for (int index = numElements; index > location; index--) {
            list[index] = list[index - 1];
        }
        list[location] = element;
        numElements++;
    }
    public boolean remove(T element) {
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
