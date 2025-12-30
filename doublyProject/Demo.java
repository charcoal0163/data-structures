package javaapplication216;
public class doublyDemo {
    public static void main(String[] args) {
        DLLNode<Integer> one = new DLLNode<>(3);
        DLLNode<Integer> two = new DLLNode<>(5);
        DLLNode<Integer> first = new DLLNode<>(7);
        DLLNode<Integer> last = new DLLNode<>(9);
        
        //linking first and one
        first.setFront(one);
        one.setBack(first);
        
        //linking one and two
        one.setFront(two);
        two.setBack(one);
        
        //linking two and last
        two.setFront(last);
        last.setBack(two);
    }
}
