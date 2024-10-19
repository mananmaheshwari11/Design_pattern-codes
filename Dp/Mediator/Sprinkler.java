package Mediator;

public class Sprinkler extends Device {

    public Sprinkler(HomeAutomationMediator mediator){
        super(mediator);
    }
    //write the constructor and triggerEvent() methods
    // implement the checkWeather(), scheduleWatering() method
    public void checkWeather() {
        triggerEvent();
        System.out.println("Checking weather conditions...");
    }
    public void scheduleWatering(){
        triggerEvent();
        System.out.println("Sprinkler watering event scheduled");
    }
    @Override
    public void triggerEvent() {
        System.out.println("Sprinkler detected");        
    }
}