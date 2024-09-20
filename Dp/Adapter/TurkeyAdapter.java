package Adapter;
//adapter implements target adaptee and adaptee ka object 
public class TurkeyAdapter implements Duck {
    Turkey t;
    public TurkeyAdapter(Turkey turkey){
     t=turkey;
    }
    public void fly(){
    for(int i=1;i<=5;i++){
        t.fly();
    }
    }
    public void quack(){
        t.gobble();
    }
}
