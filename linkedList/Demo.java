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
    public static int max(RefUnsortedList<Integer> list){
        list.reset();
        int max = list.getNext();
        for(int i = 0; i < list.size(); i++){
            int element = list.getNext();
            if(element > max){
                max = element;
            }
        }
        return max;
    }
    public static <T> void removeMid(RefUnsortedList<T> list){
        list.reset();
        int size = list.size() / 2;
        RefUnsortedList<T> temp = new RefUnsortedList<>();
        for(int i = 0; i < size; i++){
            T e  = list.getNext();
            temp.add(e);
            list.remove(e);
        }
        list.reset();
        list.remove(list.getNext());
        temp.reset();
        while(temp.size() != 0){
            T e = temp.getNext();
            list.add(e);
            temp.remove(e);
        }
    }
    public static void main(String[] args) {
        RefUnsortedList<Integer> d = new RefUnsortedList();

        d.add(3);
        d.add(-5);
        d.add(8);
        d.add(99);
        d.add(-1);
        System.out.println(d);
        removeMid(d);
        System.out.println(d);
        
/*        Scanner key = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = key.nextInt();
        for(int i =0; i<n; i++){
            d.add(key.nextInt());
        }
        System.out.println("---------------------");
        System.out.println(d);
/*
        d.addLast(600);
        System.out.println("-----after add last----------------");
        System.out.println(d);
        d.removeLast();
        System.out.println("------after remove last ---------------");
        System.out.println(d);
        d.removeMiddle();
        System.out.println("------after remove middle ---------------");
        System.out.println(d);
*/
    }
}
