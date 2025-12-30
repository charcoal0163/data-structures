package javaapplication180;
public class proj {
    static int x = 10;
    static int y = 11;
    int w = 12;
    public void fun(){ //a non-static method can access a static instance
        x = 33;
        w = 11;
    }
    public static int sum(){ //a static method cannot access a non-static instance without creating an object
        proj obj4 = new proj();
        obj4.w = 101;
        return x + y;
    }
    public static void main(String[] args) {
        System.out.println(proj.x);
        proj obj3 = new proj();
        System.out.println(obj3.w);
        System.out.println("----");
        System.out.println("sum = " + sum());
    }
}
