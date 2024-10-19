package Mediator;

public class Alarm extends Device {
    public Alarm(HomeMediator mediator) {
        super(mediator);
    }
    public void triggerEvent() {
        super.mediator.notify("alarmEvent",this);
        //call the notify() method of mediator for alarm event
    }
    public void resetAlarm(){
        System.out.println("Alarm get reset for the next day");
    }
}
