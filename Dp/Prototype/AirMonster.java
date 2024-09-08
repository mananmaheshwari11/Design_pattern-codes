
public class AirMonster implements Monster {
   
    public void display(){
            System.out.println("I am Air Monster");
    }
    public Monster clone(){
        try {
        return (Monster)super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
