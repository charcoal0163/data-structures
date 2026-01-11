package Linked_Queue;
public class Demo {
    public static void countPN(LinkedQueue<Integer> qyoo){
        int pos = 0;
        int neg = 0;
        LinkedQueue<Integer> temp = new LinkedQueue<>();
        while(!qyoo.isEmpty()){
            int e = qyoo.dequeue();
            if(e < 0){
                ++neg;
            }
            else if(e > 0){
                ++pos;
            }
            temp.enqueue(e);
        }
        while(!temp.isEmpty()){
            qyoo.enqueue(temp.dequeue());
        }
        System.out.println("positives: " + pos);
        System.out.println("negatives: " + neg);
    }
    public static void main(String[] args) {
        LinkedQueue<Integer> qyoo = new LinkedQueue<>();
        qyoo.enqueue(10);
        qyoo.enqueue(2);
        System.out.println(qyoo.dequeue());
        qyoo.enqueue(-5);
        qyoo.enqueue(31);
        qyoo.enqueue(6);
        qyoo.enqueue(-9);
        System.out.println(qyoo.isEmpty());
        countPN(qyoo);
    }
}
