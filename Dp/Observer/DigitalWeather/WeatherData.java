package Observer.DigitalWeather;

import java.util.ArrayList;

public class WeatherData implements Subject {
    float temp,humid,pressure;
    ArrayList <Observer>obv=new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
       obv.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        obv.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer ob: obv){
            ob.update(temp, humid, pressure);
        }
    }
    
    public float getTemp(){
        return this.temp;
    }
    public float getHumid(){
        return this.humid;
    }
    public float getPressure(){
        return this.pressure;
    }
    public void setMeasurementChange(float temp,float humid,float pressure){
        this.temp=temp;
        this.humid=humid;
        this.pressure=pressure;
        notifyObserver();
    }

}
