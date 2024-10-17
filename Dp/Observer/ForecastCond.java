package Observer;

public class ForecastCond implements Observer,DisplayElement {
    float temp,humid,pressure;
    Subject subject;
    public ForecastCond(Subject subject){
        this.subject=subject;
        subject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("The forecast temperature is "+(temp+5));
        System.out.println("The forecast humidity is "+(humid+50));
        System.out.println("The forecast pressure is "+(pressure+100));
    }

    @Override
    public void update(float temp, float humid, float pressure) {
       this.temp=temp;
       this.humid=humid;
       this.pressure=pressure;
       display();
    }
}
