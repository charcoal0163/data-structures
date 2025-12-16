package Linkedpkg;
import java.util.Scanner;

public class DemoNodes {
    
    
   
    
    
   public static void main(String[] args) {
      
        LLNode<Integer> list = new LLNode<>(10);
        LLNode<Integer> node1 = new LLNode<>(3);
        LLNode<Integer> node2 = new LLNode<>(2);
        LLNode<Integer> node3 = new LLNode<>(6);
        LLNode<Integer> node4 = new LLNode<>(9);
        list.setLink(node1);
        node1.setLink(node2);
        node2.setLink(node3);
        node3.setLink(node4);
        node1=node2=node3=node4=null;
        // List traversal - print linked list 
        
  
     //   showLinkedList(list);  // add static method 
        
     //   System.out.println("The length of list = " + LLLength(list));   // add static method 
         
     //   showFirstHalfLL(list);     // add static method 
        
        System.out.println("______");
    //    showSecondHalfLL(list);     // add static method 
        
        
     //   System.out.println("Search " + search1(list, 2));     // add static method 
        
        
        
        
        
      
    }
}