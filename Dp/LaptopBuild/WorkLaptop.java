package LaptopBuild;

public class WorkLaptop implements LaptopBuilder {
    Laptop l;
    public WorkLaptop(){
        l=new Laptop();
    }
    public void buildRam(String ram){
        l.setRam(ram);
    }
    public void buildProcessor(String p){
        l.setProcessor(p);
    }
    public void buildScreen(String screen){
        l.setScreen(screen);
    }
    public void buildTouch(String touch){
        l.setTouchpad(touch);
    }
    public Laptop getResult(){
        return l;
    }
}
