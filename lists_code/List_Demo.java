package lists_code;
import java.util.Scanner;
public class List_Demo {
    public static <T> void print(ArrayUnsortedList<T> list){
        list.reset();
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.getNext() + "   ");
        }
        System.out.println();
    }
    public static <T> void printFirst(ArrayUnsortedList<T> list){
        if(list.size() != 0){
            list.reset();
            System.out.println("first element: " + list.getNext());
            System.out.println();
        }
    }
    public static <T> void nElements(ArrayUnsortedList<T> list, int n){
        if(list.size() != 0){
            list.reset();
            for(int i = 0; i < n; i++){
                System.out.println(list.getNext());
            }
            System.out.println();
        }
    }
    public static <T> void removeN(ArrayUnsortedList<T> list, T n){
        while(list.remove(n));
    }
    public static <T> void removeAll(ArrayUnsortedList<T> list){
        while(list.size() != 0){
            list.reset();
            list.remove(list.getNext());
        }
    }
    public static int sum(ArrayUnsortedList<Integer> list){
        int sum = 0;
        list.reset();
        for(int i = 0; i < list.size(); i++){
            sum += list.getNext();
        }
        return sum;
    }
    public static <T> ArraySortedList<T> sort(ArrayUnsortedList<T> list){
        ArraySortedList<T> sorted = new ArraySortedList<>();
        list.reset();
        for(int i = 0; i < list.size(); i++){
            sorted.add(list.getNext());
        }
        return sorted;
    }
    public static <T> ArrayUnsortedList<T> slice(ArrayUnsortedList<T> list, int first, int last){
        ArrayUnsortedList<T> sliced = new ArrayUnsortedList<>();
        list.reset();
        for(int i = first; i <= last; i++){
            sliced.add(list.getNext());
        }
        return sliced;
    }
    public static void main(String[] args) {
        ArrayUnsortedList<Integer> first = new ArrayUnsortedList<>();
        first.add(3);
        first.add(-2);
        first.add(7);
        first.add(15);
        first.add(21);
        first.add(7);
        first.add(4);
        System.out.println(first);
        printFirst(first);

        System.out.println("=======");
        System.out.println(first.showFirst());
        System.out.println(first.slice(2, 5));
        
        System.out.println("after sorting");
        System.out.println();
        first = sort(first);
        System.out.println(first);

//========================================================================
        
        Scanner s = new Scanner(System.in);
        int choice;
        Integer element;
        ListInterface list = new ArrayUnsortedList();
        boolean repeat = true;
        while (repeat) {
            System.out.println("List   Menue   ");
            System.out.println("-----------------");
            System.out.println("1-   Add   ");
            System.out.println("2-   Remove   ");
            System.out.println("3-   Contains   ");
            System.out.println("4-   Reset   ");
            System.out.println("5-   getNext   element   ");
            System.out.println("6-   Display   List   ");
            System.out.println("7-   Exit");
            System.out.println("-----------------");
            System.out.println("Enter   your   choice   :   ");
            System.out.println("-----------------");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("   Enter   element   to   be   added   :");
                    element = s.nextInt();
                    list.add(element);
                    break;
                case 2:
                    System.out.print("   Enter   element   to   be   removed   :");
                    element = s.nextInt();
                    list.remove(element);
                    break;
                case 3:
                    System.out.print("   Enter   element   to   be   searched   :");
                    element = s.nextInt();
                    if (!list.contains(element)) {
                        System.out.println("   Sorry,   no   such   element   found   :<   ");
                    } else {
                        System.out.println("   I   have   it   in   the   list   :>   ");
                    }
                    break;
                case 4:
                    list.reset();
                    System.out.println("   reset   done");
                    break;
                case 5:
                    element = (Integer) list.getNext();
                    System.out.println("   next   element   is   :" + element);
                    break;
                case 6:
                    System.out.println(list.toString());
                    break;
                case 7:
                    System.out.println("   Good   Bye");
                    repeat = false;
                    break;
            }
            System.out.println("   ");
            System.out.println("   ");
        }
    }
}
