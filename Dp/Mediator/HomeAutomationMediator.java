package Mediator;

public class HomeAutomationMediator implements HomeMediator {
    Alarm alarm;
    CoffeePot coffeePot;
    Calendar calendar;
    Sprinkler sprinkler;

    HomeAutomationMediator() {
        alarm=new Alarm(this);
        coffeePot=new CoffeePot(this);
        calendar=new Calendar(this);
        sprinkler=new Sprinkler(this);
    }
    public void notify(String event, Device device) {
        switch (event) {
            case "alarmEvent":
                System.out.println("Alarm event detected!");
                calendar.checkSchedule();
                coffeePot.brewing();
                sprinkler.checkWeather();
                break;
            case "trashDay":
                System.out.println("its a trash day");
                alarm.resetAlarm();
                break;
            case "weekend":
            System.out.println("its a weekend");
                sprinkler.scheduleWatering();
                break;
            default:
                System.out.println("Unknown event.");
        }
    }
}
