package Linked_Stack;
public class Demo {
    public static <T> void print(LinkedStack<T> stack){
        System.out.println("stack is: ");
        LinkedStack<T> temp = new LinkedStack<>();
        while(!stack.isEmpty()){
            System.out.println(stack.top());
            temp.push(stack.top());
            stack.pop();
        }
        while(!temp.isEmpty()){
            stack.push(temp.top());
            temp.pop();
        }
    }
    public static boolean checkEquality (LinkedStack<Integer> s1, LinkedStack<Integer> s2){
        while (!s1.isEmpty() && !s2.isEmpty()){
            if (s1.top() != s2.top())
                return false;
            else{
                if (!s1.isEmpty() && !s2.isEmpty()){
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
        s1.push(1);
        s1.push(-2);
        s1.push(7);
        
        LinkedStack<Character> s2 = new LinkedStack<>();
        s2.push('a');
        s2.push('F');
        s2.push('j');
        s2.push('$');
        s2.push('*');
    }
}
