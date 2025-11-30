package queue;
import stack.*;
public class App1 {
    public static <T> void swap(ArrayBoundedQueue<T> queue){
        ArrayBoundedQueue<T> temp = new ArrayBoundedQueue<>();
        if(queue == null){
            System.out.println("nope lol");
            return;
        }
        if(count(queue) == 1){
            System.out.println("there's only one element in the queue, there's nothing to swap");
            return;
        }
        T first = queue.dequeue();
        T e = null;
        while(count(queue) > 1){
            e = queue.dequeue();
            temp.enqueue(e);
        }
        T last = queue.dequeue();
        queue.enqueue(last);
        while(!temp.isEmpty()){
            queue.enqueue(temp.dequeue());
        }
        queue.enqueue(first);
    }
    public static <T> void printFandL(ArrayBoundedQueue<T> queue){
        ArrayBoundedQueue<T> temp = new ArrayBoundedQueue<>();
        if(queue == null || queue.isEmpty()){
            System.out.println("nope lol");
            return;
        }
        T first = queue.dequeue();
        temp.enqueue(first);
        if(queue.isEmpty()){
            System.out.println("there's only one element in the queue and it's " + first);
            queue.enqueue(first);
            return;
        }
        T last = null;
        while(!queue.isEmpty()){
            last = queue.dequeue();
            temp.enqueue(last);
        }
        System.out.println("first element is " + first);
        System.out.println("last element is " + last);
        while(!temp.isEmpty()){
            queue.enqueue(temp.dequeue());
        }
    }
    public static <T> void reverse(ArrayBoundedQueue<T> queue){
        ArrayBoundedStack<T> tempStack = new ArrayBoundedStack<>();
        while(!queue.isEmpty()){
            tempStack.push(queue.dequeue());
        }
        while(!tempStack.isEmpty()){
            queue.enqueue(tempStack.top());
            tempStack.pop();
        }
    }
    public static boolean positives(ArrayBoundedQueue<Integer> queue){
        ArrayBoundedQueue<Integer> temp = new ArrayBoundedQueue<>();
        boolean flag = true;
        while(!queue.isEmpty()){
            int e = queue.dequeue();
            if(e < 0){
                flag = false;
            }
            temp.enqueue(e);
        }
        while(!temp.isEmpty()){
            queue.enqueue(temp.dequeue());
        }
        return flag;
    }
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
    public static <T> int deleteValue(ArrayBoundedQueue<T> queue, T element){
        ArrayBoundedQueue<T> temp = new ArrayBoundedQueue<>();
        int count = 0;
        while(!queue.isEmpty()){
            T e = queue.dequeue();
            if(e.equals(element)){
                ++count;
            }
            else{
                temp.enqueue(e);
            }
        }        
        while(!temp.isEmpty()){
            queue.enqueue(temp.dequeue());
        }
        return count;
    }
    public static <T> int replace(ArrayBoundedQueue<T> queue, T oldE, T newE){
        ArrayBoundedQueue<T> temp = new ArrayBoundedQueue<>();
        int count = 0;
        while(!queue.isEmpty()){
            T e = queue.dequeue();
            if(e.equals(oldE)){
                ++count;
                temp.enqueue(newE);
            }
            else{
                temp.enqueue(e);
            }
        }
        while(!temp.isEmpty()){
            queue.enqueue(temp.dequeue());
        }
        return count;
    }
    public static int max(ArrayBoundedQueue<Integer> queue){
        ArrayBoundedQueue<Integer> temp = new ArrayBoundedQueue<>();
        int max = -1;
        if(!queue.isEmpty()){
            max = queue.dequeue();
        }
        temp.enqueue(max);
        while(!queue.isEmpty()){
            int e = queue.dequeue();
            temp.enqueue(e);
            if(e > max){
                max = e;
            }
        }
        while(!temp.isEmpty()){
            queue.enqueue(temp.dequeue());
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayBoundedQueue<Integer> first = new ArrayBoundedQueue<>();
        first.enqueue(4);
        first.enqueue(5);
        first.enqueue(10);
        first.enqueue(11);
        first.enqueue(19);
        System.out.println(count(first));
        print(first);
        System.out.println(deleteValue(first, 10));
        
        ArrayBoundedQueue<student> mf = new ArrayBoundedQueue<>();
        ArrayBoundedQueue<student> male = new ArrayBoundedQueue<>();
        ArrayBoundedQueue<student> female = new ArrayBoundedQueue<>();
        mf.enqueue(new student("sumaya", 123, 'f'));
        student s1 = new student("thaer", 345, 'm');
        mf.enqueue(s1);
        mf.enqueue(new student("ahmad", 987, 'm'));
        mf.enqueue(new student("julia", 568, 'f'));
        mf.enqueue(new student("hadeel", 482, 'f'));

        ArrayBoundedQueue<student> temp = new ArrayBoundedQueue<>();
        while(!mf.isEmpty()){
            student e = mf.dequeue();
            if(e.getGender() == 'f'){
                female.enqueue(e);
            }
            else{
                male.enqueue(e);
            }
            temp.enqueue(e);
        }
        while(!temp.isEmpty()){
            mf.enqueue(temp.dequeue);
        }

        System.out.print("mf = ");
        print(mf);
        System.out.print("f = ");
        print(female);
        System.out.print("m = ");
        print(male);
    }
}
