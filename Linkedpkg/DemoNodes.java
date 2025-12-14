package linked_list;
public class Linked_List {
    public static void main(String[] args) {
        LLNode<Integer> list;
        LLNode<Integer> first = new LLNode<>(3);
        LLNode<Integer> second = new LLNode<>(10);
        LLNode<Integer> third = new LLNode<>(-2);
        LLNode<Integer> fourth = new LLNode<>(12);
        
        list = first;
        first.setLink(second);
        second.setLink(third);
        third.setLink(fourth);
        first = second = third = fourth = null;
    }
}
