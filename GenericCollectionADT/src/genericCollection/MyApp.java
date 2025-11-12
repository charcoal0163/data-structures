package genericCollection;
public class MyApp {
    public static void main(String[] args) {
        Collection<Integer> c1 = new Collection<>(6);
        c1.add(2);
        c1.add(111);
        c1.add(-5);
        c1.add(-9);
        c1.add(2);
        c1.add(2);

        System.out.println(c1);
        System.out.println(c1.count(2));
        System.out.println(c1.count(-9));
        System.out.println(c1.count(999));
        System.out.println();

        System.out.println(c1.find(-5));
        System.out.println(c1.find(2));
        System.out.println(c1.find(-3));
        System.out.println(c1.find(111));
        System.out.println();

        c1.update(0, 88);
        System.out.println(c1);

        c1.clear(1);
        c1.clear(4);
        System.out.println(c1);
    }
}
