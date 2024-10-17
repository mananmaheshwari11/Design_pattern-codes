package Observer;

public class StatisticsCond implements Observer,DisplayElement {
    float temp,humid,pressure;
    Subject subject;
    public StatisticsCond(Subject subject){
        this.subject=subject;
        subject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("The statistical temperature is "+temp);
        System.out.println("The statistical humidity is "+humid);
        System.out.println("The statistical pressure is "+pressure);
    }

    @Override
    public void update(float temp, float humid, float pressure) {
       this.temp=temp;
       this.humid=humid;
       this.pressure=pressure;
       display();
    }
    
}
