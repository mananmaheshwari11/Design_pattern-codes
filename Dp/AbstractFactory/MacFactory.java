package AbstractFactory;

public class MacFactory extends GUIFactory {
    public Buttons makeButton(){
        Buttons b=new MacButtons(); 
        return b;
    }
    public Checkbox makeCheckbox(){
        Checkbox c=new MacCheckbox();
        return c;
    }
}
