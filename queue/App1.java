package queue;
import java.util.Scanner;
public class App1 {
    public static <T> void print(ArrayBoundedQueue<T> queue){
        ArrayBoundedQueue<T> temp = new ArrayBoundedQueue<>();
        while(!queue.isEmpty()){
            T e = queue.dequeue();
            System.out.println(e);
            temp.enqueue(e);
        }
        while(!temp.isEmpty()){
            queue.enqueue(temp.dequeue());
        }
    }
    public static <T> int count(ArrayBoundedQueue<T> queue){
        ArrayBoundedQueue<T> temp = new ArrayBoundedQueue<>();
        int count = 0;
        while(!queue.isEmpty()){
            T e = queue.dequeue();
            ++count;
            temp.enqueue(e);
        }
        while(!temp.isEmpty()){
            queue.enqueue(temp.dequeue());
        }
        return count;
    }    
    public static int sum(ArrayBoundedQueue<Integer> queue){
        ArrayBoundedQueue<Integer> temp = new ArrayBoundedQueue<>();
        int sum = 0;
        while(!queue.isEmpty()){
            int e = queue.dequeue();
            sum += e;
            temp.enqueue(e);
        }
        while(!temp.isEmpty()){
            queue.enqueue(temp.dequeue());
        }
        return sum;
    }
    public static void reorder(ArrayBoundedQueue<Integer> queue){
        ArrayBoundedQueue<Integer> even = new ArrayBoundedQueue<>();
        ArrayBoundedQueue<Integer> odd = new ArrayBoundedQueue<>();
        while(!queue.isEmpty()){
            int e = queue.dequeue();
            if(e % 2 == 0){
                even.enqueue(e);
            }
            else{
                odd.enqueue(e);
            }
        }
        while(!even.isEmpty()){
            queue.enqueue(even.dequeue());
        }
        while(!odd.isEmpty()){
            queue.enqueue(odd.dequeue());
        }
    }
    public static void main(String[] args) {
        ArrayBoundedQueue<Integer> first = new ArrayBoundedQueue<>(5);
    }
}
