package LinkedCircularPackage;
public class App {
    public static <T> void print(LLNode<T> list){
        if(list == null){
            System.out.println("lol nope");
        }
        else{
            LLNode<T> point = list.getLink();
            System.out.println("list:");
            while(point != list){
                System.out.print(point.getInfo() + "  ");
                point = point.getLink();
            }
            System.out.println(point.getInfo());
        }
    }
    public static <T> LLNode<T> addFirst(T element, LLNode<T> list){
        LLNode<T> jdide = new LLNode<>(element);
        if(list == null){
            list = jdide;
            jdide.setLink(list);
        }
        else{
            jdide.setLink(list.getLink());
            list.setLink(jdide);
        }
        return list;
    }
    public static <T> LLNode<T> deleteFirst(LLNode<T> list){
        if(list == null || list.getLink() == list){
            list = null;
        }
        else{
            list.setLink(list.getLink().getLink());
        }
        return list;
    }
    public static <T> LLNode<T> addLast(T element, LLNode<T> list){
        LLNode<T> jdide = new LLNode<>(element);
        if(list == null){
            list = jdide;
            jdide.setLink(list);
        }
        else{
            jdide.setLink(list.getLink());
            list.setLink(jdide);
            list = jdide;
        }
        return list;
    }
    public static <T> LLNode<T> deleteLast(LLNode<T> list){
        if(list == null || list.getLink() == list){
            list = null;
        }
        else{
            LLNode<T> point = list.getLink();
            while(point.getLink() != list){
                point = point.getLink();
            }
            point.setLink(list.getLink());
            list = point;
        }
        return list;
    }
    //alternative method to print a list
    public static <T> void printDoWhile(LLNode<T> list){
        if(list == null){
            System.out.println("lol nope");
        }
        else{
            LLNode<T> point = list.getLink();
            System.out.println("list do/while:");
            do{
                System.out.print(point.getInfo() + "  ");
                point = point.getLink();
            } while(point != list.getLink());
            System.out.println();
        }
    }
    public static int sum(LLNode<Integer> list){
        int sum = 0;
        LLNode<Integer> point = list.getLink();
        while(point != list){
            sum += point.getInfo();
            point = point.getLink();
        }
        sum += point.getInfo();
        return sum;
    }
/*    public static int max(LLNode<Integer> list){
        if(list != null){
            int max = list.getInfo();
            LLNode<Integer> point = list.getLink();
            while(point != list){
                
            }
        }
    }*/
    public static <T> boolean isCircular(LLNode<T> list){
        boolean flag = false;
        if(list == null){
            return false;
        }
        else{
            LLNode<T> point = list.getLink();
            while(point != list && point != null){
                point = point.getLink();
            }
            if(point == list){
                flag = true;
            }
            return flag;
        }
    }
    public static void main(String[] args){
        LLNode<Integer> list = null;

        list = addFirst(6, list);
        list = addFirst(-4, list);
        list = addFirst(12, list);
        list = addFirst(7, list);
        list = addFirst(-21, list);
        print(list);
        printDoWhile(list);
        list = deleteFirst(list);
        print(list);
        list = addLast(3, list);
        list = addLast(99, list);
        print(list);
    }
}

