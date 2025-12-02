package lists_code;
import java.util.Scanner;
public class List_Demo {
    public static void main(String[] args) {
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