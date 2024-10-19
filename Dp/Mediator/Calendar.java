package Mediator;

public class Calendar extends Device {

    public Calendar(HomeAutomationMediator mediator){
        super(mediator);
    }
    //write the constructor and triggerEvent() methods
    // implement the checkSchedule() method

    @Override
    public void triggerEvent() {
        System.out.println("Calendar event shoot");
    }
    public void checkSchedule(){
        triggerEvent();
        System.out.println("Checking the day");
        super.mediator.notify("weekend", this);
    }
}