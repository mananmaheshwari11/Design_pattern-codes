package Observer;

public class Client {
    public static void main(String[] args) {
        WeatherData subject=new WeatherData();
        Observer ob=new CurrentCond(subject);
        Observer ob1=new StatisticsCond(subject);
        Observer ob2=new ForecastCond(subject);
        subject.setMeasurementChange(37, 100, 100);
        subject.setMeasurementChange(27, 10, 060);
        
    }
}
