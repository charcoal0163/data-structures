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
        //add a new node at the first location
        LLNode<Integer> nodeJdid = new LLNode<>(3);
        nodeJdid.setLink(list);
        list = nodeJdid;
    }
}
