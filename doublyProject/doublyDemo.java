package javaapplication216;
public class doublyDemo {
    public static <T> void printFwd(DLLNode<T> head){
        DLLNode<T> point = head;
        System.out.println("list from top:");
        while(point != null){
            System.out.print(point.getInfo() + "  ");
            point = point.getFront();
        }
        System.out.println();
    }
    public static <T> void printBwd(DLLNode<T> tail){
        DLLNode<T> point = tail;
        System.out.println("list from bottom:");
        while(point != null){
            System.out.print(point.getInfo() + "  ");
            point = point.getBack();
        }
        System.out.println();
    }
    //print the list regardless of what the function receives (head or tail)
    public static <T> void print(DLLNode<T> list){
        DLLNode<T> point = list;
        if(list.getBack() == null){
            System.out.println("list from top:");
            while(point != null){
                System.out.print(point.getInfo() + "  ");
                point = point.getFront();
            }
            System.out.println();
        }
        else{
            System.out.println("list from bottom:");
            while(point != null){
                System.out.print(point.getInfo() + "  ");
                point = point.getBack();
            }
        System.out.println();
        }
    }
    public static <T> int size(DLLNode<T> head){
        DLLNode<T> point = head;
        int count = 0;
        while(point != null){
            ++count;
            point = point.getFront();
        }
        return count;
    }
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
        System.out.println();
        //backward print: version 1 (without last)
        DLLNode<Integer> pointer = first;
        while(pointer.getFront() != null){
            pointer = pointer.getFront();
        }
        while(pointer != null){
            System.out.print(pointer.getInfo() + "  ");
            pointer = pointer.getBack();
        }
        System.out.println();
        //backward print: version 2 (with last)
        DLLNode<Integer> visit = last;
        while(visit != null){
            System.out.print(visit.getInfo() + "  ");
            visit = visit.getBack();
        }
        System.out.println();
        //add new node at the beginning
        DLLNode<Integer> jdide = new DLLNode<>(12);
        jdide.setFront(first);
        first.setBack(jdide);
        first = jdide;
        //add new node at the end
        DLLNode<Integer> jdide2 = new DLLNode<>(-2);
        jdide2.setBack(last);
        last.setFront(jdide2);
        last = jdide2;
        
        print(first);
        print(last);
        System.out.println(size(first));

        //remove first
        first = first.getFront();
        first.setBack(null);

        //remove last
        last = last.getBack();
        last.setFront(null);

        //search for a node
        Integer e = 7;
        DLLNode<Integer> v = first;
        while(v != null){
            if(v.getInfo().equals(e)){
                break;
            }
            v = v.getFront();
        }
        if(v = null){
            System.out.println("lol nope");
        }
        else{
            System.out.println("yay");
        }
    }
}
