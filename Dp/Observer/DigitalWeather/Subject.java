package Observer.DigitalWeather;

public interface Subject {
    Observer obv=null;
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
    void setMeasurementChange(float temp,float humid,float pressure);
    
}
