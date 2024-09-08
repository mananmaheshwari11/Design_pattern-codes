
public class WaterMonster implements Monster {
    public void display(){
        System.out.println("I am Water Monster");
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
