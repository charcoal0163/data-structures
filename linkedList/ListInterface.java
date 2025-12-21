package linkedList;
public interface ListInterface<T> {
    int size();
    void add(T element);
    boolean remove(T element);
    boolean contains(T element);
    T get(T element);
    String toString();
    void reset();
    T getNext();
}