package Mediator;

public class Main {
    public static void main(String[] args) {
        //create a mediator
       HomeMediator mediator=null;
       mediator=new HomeAutomationMediator();
       Alarm a=new Alarm(mediator);
        // Simulate various events
        a.triggerEvent();
       
    }
}
