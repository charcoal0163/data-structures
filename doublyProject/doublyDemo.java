package javaapplication216;
public class doublyDemo {
    public static void main(String[] args) {
        DLLNode<Integer> one = new DLLNode<>(9);
        DLLNode<Integer> two = new DLLNode<>(-4);
        DLLNode<Integer> first = new DLLNode<>(7);
        DLLNode<Integer> last = new DLLNode<>(3);
        
        //linking first and one: first <--> one
        first.setFront(one);
        one.setBack(first);
        
        //linking one and two: one <--> two
        one.setFront(two);
        two.setBack(one);
        
        //linking two and last: two <--> last
        two.setFront(last);
        last.setBack(two);
        one = two = null;
        
        //forward print
        DLLNode<Integer> point = first;
        while(point != null){
            System.out.print(point.getInfo() + "  ");
            point = point.getFront();
        }
        
        //backward print: version 1 (without last)
        DLLNode<Integer> pointer = first;
        while(pointer.getFront() != null){
            pointer = pointer.getFront();
        }
        while(pointer != null){
            System.out.println(pointer.getInfo() + "  ");
            pointer = pointer.getBack();
        }
        
        //backward print: version 2 (with last)
        DLLNode<Integer> visit = last;
        while(visit != null){
            System.out.println(visit.getInfo() + "  ");
            visit = visit.getBack();
        }
    }
}
