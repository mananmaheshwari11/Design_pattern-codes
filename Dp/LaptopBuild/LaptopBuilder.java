package LaptopBuild;

public interface LaptopBuilder {
    void buildRam(String ram);
    void buildProcessor(String p);
    void buildTouch(String touch);
    void buildScreen(String screen);
    Laptop getResult();
}
