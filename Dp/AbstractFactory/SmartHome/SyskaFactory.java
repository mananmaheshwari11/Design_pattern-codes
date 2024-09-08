package AbstractFactory.SmartHome;

public class SyskaFactory implements BrandFactory{
    public BrandFactory createFactory(){
        return new SyskaFactory();
    }
    
}
