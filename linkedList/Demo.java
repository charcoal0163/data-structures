package linkedList;
import java.util.Scanner;
public class Demo {
    public static int sum(RefUnsortedList<Integer> list){
        int sum = 0;
        list.reset();
        for(int i = 0; i < list.size(); i++){
            sum += list.getNext();
        }
        return sum;
    }
    public static void main(String[] args) {
        RefUnsortedList<Integer> d = new RefUnsortedList();
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = key.nextInt();
        for(int i =0; i<n; i++) {
            d.add(key.nextInt());
        }
        System.out.println("---------------------");
        System.out.println(d);
        d.addLast(600);
        System.out.println("-----after add last----------------");
        System.out.println(d);
        d.removeLast();
        System.out.println("------after remove last ---------------");
        System.out.println(d);
        d.removeMiddle();
        System.out.println("------after remove middle ---------------");
        System.out.println(d);
    }
}
