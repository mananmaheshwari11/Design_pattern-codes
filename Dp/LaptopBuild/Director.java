package LaptopBuild;

public class Director {
    public LaptopBuilder lb;
    public Director(LaptopBuilder lb){
        this.lb=lb;
    }
    public void construct(String ram,String p,String touch,String screen){
        lb.buildRam(ram);
        lb.buildProcessor(p);
        lb.buildTouch(touch);
        lb.buildScreen(screen);
    }
    public Laptop geLaptop(){
        return lb.getResult();
    }
}
