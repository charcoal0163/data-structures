package genericCollection;
public interface CollectionInterface<T> {
    public void add(T element);
    public void remove();
    public boolean isFull();
    public boolean isEmpty();
    public int size();
    public int count(T element);
    public void clear(int loc);
    public int find(T element);
    public void update(int index, T newElement);
}