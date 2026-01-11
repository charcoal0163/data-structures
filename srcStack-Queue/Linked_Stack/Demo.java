package Linked_Stack;
public class DemoDupMetthod {
    public static void countPN(LinkedStack<Integer> stack){
        LinkedStack<Integer> temp = new LinkedStack<>();
        int pos = 0;
        int neg = 0;
        while(!stack.isEmpty()){
            if(stack.top() < 0){
                ++neg;
            }
            else if(stack.top() > 0){
                ++pos;
            }
            temp.push(stack.top());
            stack.pop();
        }
        while(!temp.isEmpty()){
            stack.push(temp.top());
            temp.pop();
        }
        System.out.println("positives: " + pos);
        System.out.println("negatives: " + neg);
    }
    public static <T> void print(LinkedStack<T> stack){
        System.out.println("stack is: ");
        LinkedStack<T> temp = new LinkedStack<>();
        while(!stack.isEmpty()){
            System.out.print(stack.top() + " ");
            temp.push(stack.top());
            stack.pop();
        }
        while(!temp.isEmpty()){
            stack.push(temp.top());
            temp.pop();
        }
        System.out.println();
    }
    public static boolean checkEquality (LinkedStack<Integer> first, LinkedStack<Integer> second){
        LinkedStack<Integer> tempOne = new LinkedStack<>();
        LinkedStack<Integer> tempTwo = new LinkedStack<>();
        while (!first.isEmpty() && !second.isEmpty()){
            if (first.top() != second.top()){
                return false;
            }
            else{
                if (!first.isEmpty() && !second.isEmpty()){
                    tempOne.push(first.top());
                    first.pop();
                    tempTwo.push(second.top());
                    second.pop();
                }
            }
        }
        while(!tempOne.isEmpty()){
            first.push(tempOne.top());
            tempOne.pop();
        }
        while(!tempTwo.isEmpty()){
            second.push(tempTwo.top());
            tempTwo.pop();
        }
        if (!first.isEmpty() || !second.isEmpty()){
            return false;
        }
        return true;                
    }
    public static void main(String[] args){
        LinkedStack<Integer> s1 = new LinkedStack<>();
        s1.push(1);
        s1.push(-2);
        s1.push(7);
        s1.push(-3);
        s1.push(4);
        LinkedStack<Character> s2 = new LinkedStack<>();
        s2.push('a');
        s2.push('F');
        s2.push('j');
        s2.push('$');
        s2.push('*');
        print(s1);
        print(s2);
        countPN(s1);
    }
}
