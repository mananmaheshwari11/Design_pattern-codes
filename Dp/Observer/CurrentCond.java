package Observer;

public class CurrentCond implements Observer,DisplayElement {
    float temp,humid,pressure;
    Subject subject;
    public CurrentCond(Subject subject){
        this.subject=subject;
        subject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("The current temperature is "+temp);
        System.out.println("The current humidity is "+humid);
        System.out.println("The current pressure is "+pressure);
    }

    @Override
    public void update(float temp, float humid, float pressure) {
       this.temp=temp;
       this.humid=humid;
       this.pressure=pressure;
       display();
    }
    
}
