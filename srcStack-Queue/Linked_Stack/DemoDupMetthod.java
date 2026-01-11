
package Linked_Stack;


public class DemoDupMetthod {
    
//    public static void countPosNeg(LinkedStack<Integer> s)
//    {
//        LinkedStack<Integer> t = new LinkedStack<>();
//        int pos = 0;
//        int neg = 0;
//        while (!s.isEmpty())
//        {
//            if (s.top()<0)
//                ++neg;
//            else
//                ++pos;
//            t.push(s.top());
//            s.pop();
//        }
//        while (!t.isEmpty())
//        {
//            s.push(t.top());
//            t.pop();
//        }
//        
//        System.out.println("count of pos is : "+pos);
//        System.out.println("count of neg is : "+neg);                
//    }
    
    public static boolean checkEquality (LinkedStack<Integer> s1, LinkedStack<Integer> s2)
    {
        while (!s1.isEmpty() && !s2.isEmpty())
        {
            if (s1.top() != s2.top())
                return false;
            else
            {
                if (!s1.isEmpty() && !s2.isEmpty()) 
                {
                    s1.pop();
                    s2.pop();            
                }
            }                        
        }
        if (!s1.isEmpty() || !s2.isEmpty())
                return false;            
        return true;                
    }
    
    public static void main(String[] args)
    {
        LinkedStack<Integer> s1 = new LinkedStack<>();
        LinkedStack<Integer> s2 = new LinkedStack<>();
        s1.push(1);
        s1.push(-2);
        s1.push(7);
        //s1.push(-3);
        
        s2.push(1);
        s2.push(-2);
        s2.push(7);
        s2.push(-3);
        s2.push(-3);
        
        System.out.println(checkEquality(s1, s2));
        
        
//        while (!s.isEmpty())
//        {
//            System.out.println(s.top());
//            s.pop();
//        
//        }
//        int x;
//        LinkedStack<Integer> bStack = new LinkedStack<>();
//        bStack.push(7);
//        bStack.push(8);
//        bStack.push(-3);
//        bStack.push(14);
//        bStack.push(5);
//        while (!bStack.isEmpty())
//        {
//            x = bStack.top();
//            bStack.pop();
//            if (x>0 && !bStack.isEmpty())
//                bStack.pop();
//            System.out.println(x);
//        }            
    }
    
}
