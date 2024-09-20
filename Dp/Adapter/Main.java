package Adapter;

public class Main {
    static void test(Duck d){
        d.fly();
        d.quack();
    }
    public static void main(String[] args) {
        Duck d=new TurkeyAdapter(new WildTurkey());
        Main.test(d);
    }
}
