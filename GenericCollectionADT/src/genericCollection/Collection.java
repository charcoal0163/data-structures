package genericCollection;
public class Collection<T> implements CollectionInterface<T> {
    private int index = -1;
    private T[] ar;
    public Collection(){
        ar = (T[]) new Object [10];
    }
    public Collection(int arSize) {
        ar = (T[]) new Object[arSize];
    }
    public void add(T element) {
        if (index < ar.length-1){
            ++index;
            ar[index]=element;
        }
    }
    public void remove() {
        if (index > -1){
            ar[index] = null;
            --index;
        }
    }
    public String toString() {
        String contents = "Collection contains:\n";
        for (int i = 0; i <= index; i++){
            contents = contents + ar[i] + "\n";
        }
        return contents;
    }
    public boolean isEmpty() {
        return index == -1;
    }
    public boolean isFull() {
        return index == ar.length - 1;
    }
    public int size() {
        return index + 1;
    }
    public int count(T element) {
        System.out.println("== count element (" + element + ") ==");
        int counter = 0;
        for (int i = 0; i <= index; i++){
            if (element.equals(ar[i])){
                counter++;
            }
        }
        System.out.print("number of occurences of element (" + element + ") is: " );
        return counter;
    }
    public void clear(int loc) {
        System.out.println("== clear element at location (" + loc + ") ==");
        if (index > -1){
            ar[loc] = null;
        }
    }
    public int find(T element) {
        System.out.println("== find (" + element + ") ==");
        for (int i = 0; i <= index; i++){
            if (element.equals(ar[i])){
                System.out.print("index of first occurence of " + element + " is: ");
                return i;
            }
        }
        System.out.print("index of first occurence of " + element + " is: ");
        return -1;
    }
    public void update(int index, T newElement) {
        System.out.println("== update (" + index + ", " + newElement + ") ==");
        if (index >= 0 && index <= this.index){
            ar[index] = newElement;
        }
    }
}

