package Mediator;


class CoffeePot extends Device {
    public CoffeePot(HomeAutomationMediator m){
        super(m);
    }
    @Override
    public void triggerEvent() {
        System.out.println("Coffee Pot shoot event");
    }
    //write the constructor and triggerEvent() methods
    public void brewing(){
        triggerEvent();
        System.out.println("Coffee started brewing");
    }
}