package ConstructorBehavior;
public class ADemo {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A("A");
        A a2 = new A (1);
        A a3 = new A("a",1);
        a.setX("A");
        a.setY(1);
        System.out.println(a.getX());
        System.out.println(a.getY());
        
        
    }
}
