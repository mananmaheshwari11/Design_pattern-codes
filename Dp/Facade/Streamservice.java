package Facade;

public class Streamservice {
    public void prepareStream(String movieName){
        System.out.println("Starting"+movieName);
    }
    public void startStream(){
        System.out.println("Running");
    }
}
