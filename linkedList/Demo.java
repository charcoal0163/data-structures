/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedList;

import java.util.Scanner;


public class Demo {
    

    public static void main(String[] args) {
        // TODO code application logic here
        RefUnsortedList<Integer> d = new RefUnsortedList();
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = key.nextInt();
        for(int i =0; i<n; i++)
        {
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
