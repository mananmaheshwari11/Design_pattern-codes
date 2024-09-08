package AbstractFactory.SmartHome;

public class SmartHome {
    public Light l;
    public Fan f;
    public SmartHome(BrandFactory bfc){
        if(bfc instanceof CromptonFactory){
            l=new CromptonLight();
            f=new CromptonFan();
            
        }
        else{
            l=new SyskaLight();
            f=new SyskaFan();

        }
    }
    
    public static void main(String[] args) {
        SmartHome s1 = new SmartHome(new CromptonFactory());
        //SmartHome s2 = new SmartHome();
    }    
}

