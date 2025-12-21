package linkedList;
public class RefSortedList<T extends Comparable<T>> extends RefUnsortedList<T> implements ListInterface<T> {
    public RefSortedList() {
        super();
    }
    public void add(T element){
        LLNode<T> prevLoc;
        LLNode<T> location;
        T listElement;
        location = list;
        prevLoc = null;
        while (location != null) {
            listElement = location.getInfo();
            if (listElement.compareTo(element) < 0){
                prevLoc = location;
                location = location.getLink();
            }
            else {
                break;
            }
        }
        LLNode<T> newNode = new LLNode<T>(element);
        if (prevLoc == null) {
            newNode.setLink(list);
            list = newNode;
        }
        else {
            newNode.setLink(location);
            prevLoc.setLink(newNode);
        }
        numElements++;
    }
}