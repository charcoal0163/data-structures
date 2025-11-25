package stack;
public class App1 {
    public static <T> ArrayBoundedStack<T> merge(ArrayBoundedStack<T> first, ArrayBoundedStack<T> second){
        ArrayBoundedStack<T> result = new ArrayBoundedStack<>();
        ArrayBoundedStack<T> temp = new ArrayBoundedStack<>();
        while(!first.isEmpty()){
            temp.push(first.top());
            first.pop();
        }
        while(!temp.isEmpty()){
            result.push(temp.top());
            first.push(temp.top());
            temp.pop();
        }
        while(!second.isEmpty()){
            temp.push(second.top());
            second.pop();
        }
        while(!temp.isEmpty()){
            result.push(temp.top());
            second.push(temp.top());
            temp.pop();
        }
        return result;
    }
    public static int sum(ArrayBoundedStack<Integer> stack, int from, int to){
        int sum = 0;
        ArrayBoundedStack<Integer> temp = new ArrayBoundedStack<>();
        while(!stack.isEmpty()){
            if(stack.top() >= from && stack.top() <= to){
                sum += stack.top();
            }
            temp.push(stack.top());
            stack.pop();
        }
        while(!temp.isEmpty()){
            stack.push(temp.top());
            temp.pop();
        }
        return sum;
    }
    public static void split(ArrayBoundedStack<Integer> stack, ArrayBoundedStack<Integer> even, ArrayBoundedStack<Integer> odd){
        ArrayBoundedStack<Integer> temp = new ArrayBoundedStack<>();
        while(!stack.isEmpty()){
            if(stack.top() % 2 == 0){
                even.push(stack.top());
            }
            else odd.push(stack.top());
            temp.push(stack.top());
            stack.pop();
        }
        while(!temp.isEmpty()){
            stack.push(temp.top());
            temp.pop();
        }
    }
    public static <T> void reverse(ArrayBoundedStack<T> stack){
        ArrayBoundedStack<T> temp = new ArrayBoundedStack<>();
        ArrayBoundedStack<T> temp2 = new ArrayBoundedStack<>();
        while(!stack.isEmpty()){
            temp.push(stack.top());
            stack.pop();
        }
        while(!temp.isEmpty()){
            temp2.push(temp.top());
            temp.pop();
        }
        while(!temp2.isEmpty()){
            stack.push(temp2.top());
            temp2.pop();
        }
    }
    public static <T> void topHalf(ArrayBoundedStack<T> stack){
        ArrayBoundedStack<T> temp = new ArrayBoundedStack<>();
        int size = getStackSize(stack);
        for(int i = 1; i <= size / 2; i++){
            stack.pop();
        }
    }
    public static <T> void bottomHalf(ArrayBoundedStack<T> stack){
        ArrayBoundedStack<T> temp = new ArrayBoundedStack<>();
        int size = getStackSize(stack);
        while(!stack.isEmpty()){
            temp.push(stack.top());
            stack.pop();
        }
        for(int i = 1; i <= size / 2; i++){
            stack.pop();
        }
        while(!temp.isEmpty()){
            stack.push(temp.top());
            temp.pop();
        }
    }
    public static <T> void swap(ArrayBoundedStack<T> stack){
        ArrayBoundedStack<T> temp = new ArrayBoundedStack<>();
        T top = stack.top();
        stack.pop();
        while(!stack.isEmpty()){
            temp.push(stack.top());
            stack.pop();
        }
        T bottom = temp.top();
        temp.pop();
        stack.push(top);
        while(!temp.isEmpty()){
            stack.push(temp.top());
            temp.pop();
        }
        stack.push(bottom);
    }
    public static void delEven(ArrayBoundedStack<Integer> stack){
        ArrayBoundedStack<Integer> temp = new ArrayBoundedStack<>();
        while(!stack.isEmpty()){
            if(stack.top() % 2 != 0){
                temp.push(stack.top());
            }
            stack.pop();
        }
        while(!temp.isEmpty()){
            stack.push(temp.top());
            temp.pop();
        }
    }
    public static void keepEven(ArrayBoundedStack<Integer> stack){
        ArrayBoundedStack<Integer> temp = new ArrayBoundedStack<>();
        while(!stack.isEmpty()){
            if(stack.top() % 2 == 0){
                temp.push(stack.top());
            }
            stack.pop();
        }
        while(!temp.isEmpty()){
            stack.push(temp.top());
            temp.pop();
        }
    }
    public static <T> void printStack(ArrayBoundedStack<T> s){
     ArrayBoundedStack<T> temp = new ArrayBoundedStack<>();   
        System.out.println("=========== Stack Contains: ==============");
        while(!s.isEmpty()){
         T element = s.top();
            System.out.println(element);
            temp.push(element);
            s.pop();
        }
        while(!temp.isEmpty()){
         s.push(temp.top());
         temp.pop();
        }
    }
    public static <T> int getStackSize(ArrayBoundedStack<T> s){
        int count = 0;
        ArrayBoundedStack<T> temp = new ArrayBoundedStack<>();
        while(!s.isEmpty()){
            ++count;
            temp.push(s.top());
            s.pop();
        }
        while(!temp.isEmpty()){
            s.push(temp.top());
            temp.pop();
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayBoundedStack<Integer> stack = new ArrayBoundedStack<>();
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        ArrayBoundedStack<Integer> stack2 = new ArrayBoundedStack<>();
        stack2.push(11);
        stack2.push(12);
        stack2.push(13);
        stack2.push(14);
        
        ArrayBoundedStack<Integer> merged = merge(stack, stack2);
        printStack(merged);
        printStack(stack);
        reverse(stack);
        printStack(stack);
        ArrayBoundedStack<Integer> stackE = new ArrayBoundedStack<>();
        ArrayBoundedStack<Integer> stackO = new ArrayBoundedStack<>();
        split(stack, stackE, stackO);
        printStack(stackE);
        printStack(stackO);
    }
}

