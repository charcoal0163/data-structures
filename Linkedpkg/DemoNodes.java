package Linkedpkg;
import java.util.Scanner;
public class DemoNodes {
    public static void main(String[] args) {
        System.out.println("nodes: ");
        Scanner test = new Scanner(System.in);
        System.out.println("enter values - stop at 999");
        int x = test.nextInt();
        LLNode<Integer> list = null;
        while(x != 999){
            LLNode<Integer> node = new LLNode<>(x);
            node.setLink(list);
            list = node;
            x = test.nextInt();
        }
        LLNode<Integer> key = list;
        int searched = 20;
        while(key != null){
            if(key.getInfo().equals(searched)){
                System.out.println("yay");
                break;
            }
            key = key.getLink();
        }
        if (key == null){
            System.out.println("lol nope");
        }
        //add at first
        LLNode<Integer> nodeJdid = new LLNode<>(3);
        nodeJdid.setLink(list);
        list = nodeJdid;
        //add at last
        LLNode<Integer> visit = list;
        LLNode<Integer> nodeJdid2 = new LLNode<>(7);
        while(visit.getLink() != null){
            visit = visit.getLink();
        }
        visit.setLink(nodeJdid2);
        
        //remove first
        list = list.getLink();
        //remove last, using visit
        while(visit.getLink().getLink() != null){
        //why did we use getLink() twice? to stop at the node before last instead of the last one
            visit = visit.getLink();
        }
        visit.setLink(null);
    }
}
