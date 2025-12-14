package linked_list;
public class Linked_List {
    //EVEN MORE ALTERNATIVELY
    public static <T> void print(LLNode<T> list){
        LLNode<T> point = list;
        while(point != null){
            System.out.println(point.getInfo());
            point = point.getLink();
        }
    }
    public static <T> int size(LLNode<T> list){
        int counter = 0;
        LLNode<T> point = list;
        while(point != null){
            ++counter;
            point = point.getLink();
        }
        return counter;
    }
    public static <T> void printHalf(LLNode<T> list){
        int half = size(list) / 2;
        for(int i = 0; i < half; i++){
            System.out.println(list.getInfo());
            list = list.getLink();
        }
    }
    public static void main(String[] args) {
        LLNode<Integer> list;
        LLNode<Integer> first = new LLNode<>(3);
        LLNode<Integer> second = new LLNode<>(10);
        LLNode<Integer> third = new LLNode<>(-2);
        LLNode<Integer> fourth = new LLNode<>(12);
        
        //linking the list
        list = first;
        first.setLink(second);
        second.setLink(third);
        third.setLink(fourth);
        first = second = third = fourth = null;
        
        //printing the list
        System.out.println(list.getInfo());
        System.out.println(list.getLink().getInfo());
        System.out.println(list.getLink().getLink().getInfo());
        System.out.println(list.getLink().getLink().getLink().getInfo());
        System.out.println();
        
        //ALTERNATIVELY
        LLNode<Integer> point = list;
        while(point != null){
            System.out.println(point.getInfo());
            point = point.getLink();
        }
        System.out.println();

        //EVEN MORE ALTERNATIVELY
        print(list);
        
        System.out.println();
        printHalf(list);
    }
}
