 package Observer;

public interface Subject {
    Observer obv=null;
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
    
}