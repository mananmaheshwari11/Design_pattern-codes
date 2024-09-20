package Composite;

public class Main {
    public static void main(String[] args) {
        Composite c1 = new Composite();
        Leaf l1 = new Leaf();
        Composite c2 = new Composite();
        Leaf l2 = new Leaf();
        c1.add(l1);
        c1.add(c2);
        System.out.println(l1);
        System.out.println(c2);
        System.out.println(c1.getChild(0));
        System.out.println(c1.getChild(1));
        System.out.println();
        c2.add(l2);
        System.out.println(l2);
        System.out.println(c2.getChild(0));
    }
}
