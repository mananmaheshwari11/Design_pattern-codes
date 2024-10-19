package Mediator;


abstract class Device {
    HomeMediator mediator;
    public Device(HomeMediator mediator) {
        this.mediator = mediator;
    }
    public abstract void triggerEvent();
}