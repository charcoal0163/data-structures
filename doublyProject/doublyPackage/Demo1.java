package doublyPackage;
public class Demo1 {
    public static <T> boolean search(DLLNode<T> head, T element){
        DLLNode<T> point = head;
        while(point != null){
            if(point.getInfo().equals(element)){
                return true;
            }
            point = point.getFront();
        }
        return false;
    }
    public static <T> DLLNode<T> insertFront(DLLNode<T> head, T element){
        DLLNode<T> jdide = new DLLNode<>(element);
        jdide.setFront(head);
        head.setBack(jdide);
        head = jdide;
        //notice: changing the 'head' pointer doesn't reach the main, that's why we have to return the list
        return head;
    }
    public static void main(String[] args) {
        DLLNode<Integer> n1 = new DLLNode<>(10);
        DLLNode<Integer> n2 = new DLLNode<>(5);
        DLLNode<Integer> n3 = new DLLNode<>(6);
        DLLNode<Integer> n4 = new DLLNode<>(8);
        n1.setFront(n2);
        n2.setBack(n1);
        n2.setFront(n3);
        n3.setBack(n2);
        n3.setFront(n4);
        n4.setBack(n3);
        n2=n3=n4=null;
        
        // forward traverse
        n2=n1;
        while(n2!=null){
            System.out.println(n2.getInfo());
            n2=n2.getFront();
        }
        
        System.out.println("------------");
        // backward traverse
        n2=n1;
        while(n2.getFront()!=null)
            n2=n2.getFront();
        while(n2!=null){
            System.out.println(n2.getInfo());
            n2=n2.getBack();
        }
    }
}
