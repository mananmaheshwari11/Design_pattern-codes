package AbstractFactory.SmartHome;

public class CromptonFactory implements BrandFactory{
    public BrandFactory createFactory(){
        return new CromptonFactory();
    }
    
}
