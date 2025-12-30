package javaapplication180;
public class point {
    private int x;
    private int y;
    private String name;
    public point(int x, int y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }
    public point(){
        x = 0;
        y = 0;
        name = "lol nope";
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void move(int a, int b){
        x += a;
        y += b;
        System.out.println(x + ", " + y);
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + "), " + name;
    }
}