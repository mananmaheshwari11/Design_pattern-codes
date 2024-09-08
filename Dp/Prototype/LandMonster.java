
public class LandMonster implements Monster {
    public void display(){
        System.out.println("Land Monster");
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
